package ru.javawebinar.topjava.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.LoggedUser;
import ru.javawebinar.topjava.LoggerWrapper;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.service.UserMealServiceImpl;

/**
 * GKislin
 * 06.03.2015.
 */
@Controller
public class UserMealRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);

    @Autowired
    private UserMealServiceImpl service;
/*
    public UserMeal get() {
        int id = LoggedUser.id();
        LOG.info("get", id);
        return service.get(id);
    }

    public void delete() {
        int id = LoggedUser.id();
        LOG.info("delete {}", id);
        service.delete(id);
    }
*/

public void getByUserId()
{
    int userId= LoggedUser.id();
    service.getByUserId(userId);
}
    public void save(UserMeal userMeal)
    {
        LOG.info("save");
        service.save(userMeal);
    }
    public void update(UserMeal userMeal) {
        int id = userMeal.getId();
        LOG.info("update");
        service.update(userMeal);
    }
}
