package com.sbrf.reboot.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsTest {


    /*
     * Задача.
     * Имеется список лучших студентов вуза.
     *
     * 1. Иванов
     * 2. Петров
     * 3. Сидоров
     *
     * В новом семестре по результатам подсчетов оценок в рейтинг на 1 место добавился новый студент - Козлов.
     * Теперь в рейтинге участвуют 4 студента.
     * (Предполагаем что в рейтинг можно попасть только получив достаточное количество балов, что бы занять 1 место).
     *
     * Вопрос.
     * Какую коллекцию из Collections framework вы предпочтете для текущего хранения и использования списка студентов?
     *
     * Проинициализируйте students, добавьте в нее 4 фамилии студентов что бы тест завершился успешно.
     */
    @Test
    public void addStudentToRating() {

        List<String> students = new LinkedList<>();

        students.add("Иванов");
        students.add("Петров");
        students.add("Сидоров");
        students.add("Козлов");
        assertEquals(4, students.size());
    }

    /*
     * Задача.
     * Вы коллекционируете уникальные монеты.
     * У вас имеется специальный бокс с секциями, куда вы складываете монеты в хаотичном порядке.
     *
     * Вопрос.
     * Какую коллекцию из Collections framework вы предпочтете использовать для хранения монет в боксе.
     *
     * Проинициализируйте moneyBox, добавьте в нее 10 монет что бы тест завершился успешно.
     */
    @Test
    public void addMoneyToBox() {

        List<Integer> moneyBox = new LinkedList<>();

        moneyBox.add(1);
        moneyBox.add(2);
        moneyBox.add(3);
        moneyBox.add(4);
        moneyBox.add(5);
        moneyBox.add(6);
        moneyBox.add(7);
        moneyBox.add(8);
        moneyBox.add(9);
        moneyBox.add(10);

        assertEquals(10, moneyBox.size());
    }

    /*
     * Задача.
     * Имеется книжная полка.
     * Периодически вы берете книгу для чтения, затем кладете ее на свое место.
     *
     * Вопрос.
     * Какую коллекцию из Collections framework вы предпочтете использовать для хранения книг.
     *
     * Проинициализируйте bookshelf, добавьте в нее 3 книги что бы тест завершился успешно.
     */
    @Test
    public void addBookToShelf() {
        class Book {
        }

        List<Book> bookshelf = new LinkedList<>();

        bookshelf.add(new Book());
        bookshelf.add(new Book());
        bookshelf.add(new Book());

        assertEquals(3, bookshelf.size());
    }


}
