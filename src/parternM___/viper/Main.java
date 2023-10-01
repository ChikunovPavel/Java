package parternM___.viper;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;

// Интерфейс View, который определяет методы для отображения задач
 interface TaskListView {
    void showTasks(List<TaskK> tasks);
    void showTaskDetails(TaskK task);
}

// Класс ConsoleTaskListView реализует интерфейс TaskListView для консольного вывода
 class ConsoleTaskListView implements TaskListViewW {
    @Override
    public void showTasks(List<TaskK> tasks) {
        System.out.println("Список задач:");
        for (TaskK task : tasks) {
            System.out.println(task.getTitle());
        }
    }

    @Override
    public void showTaskDetails(TaskK task) {
        System.out.println("Детали задачи:");
        System.out.println("Заголовок: " + task.getTitle());
        System.out.println("Статус: " + (task.isCompleted() ? "Выполнено" : "Не выполнено"));
    }
}
//    Компонент Interactor

// Класс TaskListInteractor отвечает за бизнес-логику и получение данных
 class TaskListInteractor {
    private TaskRepositoryY repository;

    public TaskListInteractor(TaskRepositoryY repository) {
        this.repository = repository;
    }

    public List<TaskK> getTasks() {
        return repository.getTasks();
    }
}

// Интерфейс TaskRepository определяет метод для получения задач
 interface TaskRepository {
    List<TaskK> getTasks();
}

// Класс InMemoryTaskRepository реализует интерфейс TaskRepository и предоставляет список задач в памяти
 class InMemoryTaskRepository implements TaskRepositoryY {
    private List<TaskK> tasks = new ArrayList<>();

    public InMemoryTaskRepository() {
        tasks.add(new TaskK("Помыть посуду"));
        tasks.add(new TaskK("Постирать белье"));
    }

    @Override
    public List<TaskK> getTasks() {
        return tasks;
    }
}
//    Компонент Presenter

// Класс TaskListPresenter связывает View и Interactor, обрабатывает данные и события
 class TaskListPresenter {
    private TaskListViewW view;
    private TaskListInteractorr interactor;

    public TaskListPresenter(TaskListViewW view, TaskListInteractorr interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void loadTasks() {
        List<TaskK> tasks = interactor.getTasks();
        view.showTasks(tasks);
    }

    public void onTaskSelected(TaskK task) {
        view.showTaskDetails(task);
    }
}
//    Компонент Entity

// Класс Task представляет основные данные задачи
 class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
//    Компонент Router

// Класс TaskListRouter отвечает за навигацию между модулями
 class TaskListRouter {
    private Context context;

    public TaskListRouter(Context context) {
        this.context = context;
    }

    public void navigateToTaskDetails(TaskK task) {
// Реализация навигации к деталям задачи
        System.out.println("Навигация к деталям задачи: " + task.getTitle());
    }
}
//    Главный класс (Main)

// Главный класс Main, где создаются экземпляры всех компонентов
public class Main {
    public static void main(String[] args) {
        TaskListViewW view = new ConsoleTaskListViewW();
        TaskRepositoryY repository = new InMemoryTaskRepositoryY();
        TaskListInteractorr interactor = new TaskListInteractorr(repository);
        Context context  = null;
        TaskListRouter router = new TaskListRouter(context);

        TaskListPresenterR presenter = new TaskListPresenterR(view, interactor);
        presenter.loadTasks();

        TaskK selectedTask = new TaskK("Помыть посуду"); // Пример выбора задачи
        presenter.onTaskSelected(selectedTask);
    }
}
