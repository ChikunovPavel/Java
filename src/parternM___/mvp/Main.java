package parternM___.mvp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Позволяет изменять каждый компонент независимо друг от друга для простой разработки и поддержки веб-приложений
//Разделяющий архитектуру приложения на три модуля: модель (Model), представление (View), контроллер (Controller)
//Контролер перегружен бизнес логикой !
// Модель (Model)
 class TaskModel {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

// Представление (View)
 interface TaskView {
    void displayTasks(List<String> tasks);
    String getUserInput();
}

// Презентер (Presenter)
 class TaskPresenterr {
    private TaskModell model;
    private TaskVieww view;

    public TaskPresenterr(TaskModell model, TaskVieww view) {
        this.model = model;
        this.view = view;
    }

    public void onAddTaskButtonClicked() {
        String task = view.getUserInput();
        model.addTask(task);
        updateView();
    }

    private void updateView() {
        List<String> tasks = model.getTasks();
        view.displayTasks(tasks);
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        TaskModell model = new TaskModell();
        TaskVieww view = new ConsoleTaskVieww();
        TaskPresenterr presenter = new TaskPresenterr(model, view);

        presenter.onAddTaskButtonClicked();
        presenter.onAddTaskButtonClicked();

// Результат:
// Список задач:
// - Задача 1
// - Задача 2
    }
}

// Реализация Представления (View)
 class ConsoleTaskVieww implements TaskVieww {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    @Override
    public String getUserInput() {
        System.out.print("Введите новую задачу: ");
        return scanner.nextLine();
    }
}
