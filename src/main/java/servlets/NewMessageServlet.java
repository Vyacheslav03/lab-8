package servlets;

import bsu.rfe.java.group7.lab8.Chikilev.var5a.ChatMessage;
import bsu.rfe.java.group7.lab8.Chikilev.var5a.ChatUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

public class NewMessageServlet extends ChatServlet {
    private static final long serialVersionUID = 1L;
    int j = 1;
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
// По умолчанию используется кодировка ISO-8859. Так как мы
// передаѐм данные в кодировке UTF-8
// то необходимо установить соответствующую кодировку HTTP-запроса
        request.setCharacterEncoding("UTF-8");
// Извлечь из HTTP-запроса параметр 'message'
        String message = (String) request.getParameter("message");
// Если сообщение не пустое, то
        if (message != null && !"".equals(message)) {
            if(message.equals(":)")){message="&#128512";}
            if(message.equals(";)")){message="&#128513";}
// По имени из сессии получить ссылку на объект ChatUser
            ChatUser author = activeUsers.get((String)
                    request.getSession().getAttribute("name"));
            synchronized (messages) {
// Добавить в список сообщений новое

                messages.add(new ChatMessage(message, author,
                        Calendar.getInstance().getTimeInMillis()));
                //j++;
            }
        }
// Перенаправить пользователя на страницу с формой сообщения
        response.sendRedirect("/chat/compose_message.html");
    }

}
