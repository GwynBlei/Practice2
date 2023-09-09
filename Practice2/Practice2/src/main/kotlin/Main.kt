fun main(args: Array<String>) {
    // Задача 1
       val age1: Int = 42;
       val age2: Int = 21;
       println(age1);
       println(age2);

   // Задача 2
      val avg1: Int = (42 + 21) / 2;
      println(avg1);
    // ответ выводится без остатка


   // Задача 3
      val avg2: Double = (42.0 + 21.0) / 2;
      println(avg2);


   // Задача 4
      val firstName: String = "Ruslan";
      val lastName: String = "Trushchov";
      println(firstName);
      println(lastName);

   // Задача 5
      val fullName: String = lastName + " " + firstName;
      println(fullName);

    // Задача 6
       val myDetails: String = "привет, меня зовут " + fullName;
       println(myDetails);

   // Задача 7
      val beta = Triple(9, 7, 2023)
   // Задача 8
      val (month , day , year) = triple
   // Задача 9
      val ( month , _ , year1) = triple
   // Задача 10
      val month2: Int = month
       month2 = 5
      val pair = Pair ( month2, year)
}
