package parternM___.viper;

import java.util.*;

// --- Entity ---

/**
 * Класс Task представляет сущность задачи с заголовком и статусом выполнения.
 */
class TaskK {
    private String title;
    private boolean completed;

    public TaskK(String title) {
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

// --- Interactor ---

/**
 * Интерфейс TaskRepository определяет методы для работы с репозиторием задач.
 */
interface TaskRepositoryY {
    List<TaskK> getTasks();
}

/**
 * InMemoryTaskRepository - реализация TaskRepository для хранения задач в памяти.
 */
class InMemoryTaskRepositoryY implements TaskRepositoryY {
    private List<TaskK> tasks = new ArrayList<>();

    public InMemoryTaskRepositoryY() {
        tasks.add(new TaskK("Помыть посуду"));
        tasks.add(new TaskK("Постирать белье"));
    }

    @Override
    public List<TaskK> getTasks() {
        return tasks;
    }
}

/**
 * TaskListInteractor отвечает за бизнес-логику и взаимодействие с репозиторием.
 */
class TaskListInteractorr {
    private TaskRepositoryY repository;

    public TaskListInteractorr(TaskRepositoryY repository) {
        this.repository = repository;
    }

    public List<TaskK> getTasks() {
        return repository.getTasks();
    }
}

// --- View ---

/**
 * Интерфейс TaskListView определяет контракт для отображения задач.
 */
interface TaskListViewW {
    void showTasks(List<TaskK> tasks);
    void showTaskDetails(TaskK task);
}

/**
 * ConsoleTaskListView - реализация TaskListView для вывода информации в консоль.
 */
class ConsoleTaskListViewW implements TaskListViewW {
    @Override
    public void showTasks(List<TaskK> tasks) {
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
        }
    }


    @Override
    public void showTaskDetails(TaskK task) {
        System.out.println("Детали задачи:");
        System.out.println("Заголовок: " + task.getTitle());
        System.out.println("Статус: " + (task.isCompleted() ? "Выполнено" : "Не выполнено"));
    }
}

// --- Presenter ---

/**
 * TaskListPresenter связывает View и Interactor, обрабатывает взаимодействие и передает данные.
 */
class TaskListPresenterR {
    private TaskListViewW view;
    private TaskListInteractorr interactor;

    public TaskListPresenterR(TaskListViewW view, TaskListInteractorr interactor) {
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

// --- Router ---

/**
 * TaskListRouter отвечает за навигацию между экранами или модулями.
 */
class TaskListRouter1 {
    public void navigateToTaskDetails(TaskK task) {
// Здесь могла бы быть реализация навигации к другому экрану или модулю.
// В текущей версии просто выводим сообщение в консоль.
        System.out.println("Навигация к деталям задачи: " + task.getTitle());
    }
}

// --- Main class ---

/**
 * Главный класс, где создаются и связываются все компоненты.
 */


public class M {
    public static void main(String[] args) {
        TaskListViewW view = new ConsoleTaskListViewW();
        TaskRepositoryY repository = new InMemoryTaskRepositoryY();
        TaskListInteractorr interactor = new TaskListInteractorr(repository);
        TaskListRouter1 router = new TaskListRouter1();

        TaskListPresenterR presenter = new TaskListPresenterR(view, interactor);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Показать все задачи");
            System.out.println("2. Показать детали задачи");
            System.out.println("3. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Для очистки буфера

            switch (choice) {
                case 1:
                    presenter.loadTasks();
                    break;
                case 2:
                    System.out.print("Введите номер задачи: ");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 1 && taskIndex <= interactor.getTasks().size()) {
                        TaskK selectedTask = interactor.getTasks().get(taskIndex - 1);
                        presenter.onTaskSelected(selectedTask);
                    } else {
                        System.out.println("Такой задачи нет.");
                    }
                    break;
                case 3:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Повторите попытку.");
            }
        }
    }
}
