# Практикум на ЭВМ
Основной целью данного курса явлеятсе ознакомление студентами с основами профиссионального программирования с испольозованием языка Java.

## Основные темы курса:
* Основы языка программирования Java
  * Базовые операции
  * Работа с массивами 
  * Работа сколлекциями (java.util), HastMap.
  * Многопоточное программирование и синхронизация
  * Сетевое программирование
* Современные инструменты разработки ПО
  * IDE IntelliJ, Eclipse
  * Система контроля версий git, github.

## Практические задания
Все выполенные задания публикуются на github ссылка на готовые задания отсылается преподавателю

1. Настройка github
   1. cоздать пользователя на github
   2. "fork" https://github.com/artem-aliev/java-template/ репозиторий в свое пространство
   3. Клонировать его на рабочую машиную
   4. провести изменения кода сделать "commit" и "push"
   5. Прислать преподавателю ссылку на созданный репозиторий
2. Настройка IntelliJ/Eclipse
   1. Ехпортировать проект в IDE
   2. Запусить unit test [IntSortTest.java](https://github.com/artem-aliev/java-template/blob/master/src/test/java/edu/spbu/sort/IntSortTest.java)
3. Знакомимся с Java. Сортировка
   1. Заменить в файле  [IntSort.java](https://github.com/artem-aliev/java-template/blob/master/src/main/java/edu/spbu/sort/IntSort.java) станартный вызов на свой собственный алгорим. 
       Подходит любой алгорим с средней вычислительной сложностью n*log(n)
4. Обьекто ориентированное програмирование.
   1. [Matrix.java](https://github.com/artem-aliev/java-template/blob/master/src/main/java/edu/spbu/matrix/Matrix.java) интерфейс матрицы с одной операцией: умножение
   2. Задача: создать два класса DenseMatrix и SparseMatrix: плотная и разряженная матрица с соответсвующими способами хранения
   3. Имплиментировать метод "mul" умножение таким образом что была возможность умножения разных типов матриц друг на друга
   4. Написать юнит тесты лоя всех вариантов умножения. Пример: [MatrixTest.java](https://github.com/artem-aliev/java-template/blob/master/src/test/java/edu/spbu/matrix/MatrixTest.java)
5. Многопоточное программирование
   1. Добавить в  DenseMatrix и SparseMatrix метод умножающий матрицы в несколько потоков
   2. Написать тесты, убедиться в росте с корости при увелечении количества потоков
6. Сетевое программирование
   1. Написать простой http server способный отдавать html файлы из папки
   2. Написать простой http клиент способный послать "GET" запрос и распечатать полученный ответ на экране
   3. Проверить работу client/server между собой
   4. Проверить что сервер работает со стандартным браузером
   5. Проверть что клиент получает информацию с любого web сервера в Интернет