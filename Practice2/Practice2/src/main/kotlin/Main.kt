fun main(args: Array<String>) {
    // Задача 1
       val age1: Int = 32;
       val age2: Int = 21;
       println(age1);
       println(age2);

   // Задача 2
      val avg1: Int = (32 + 21) / 2;
      println(avg1);
    // ответ выводится без остатка


   // Задача 3
      val avg2: Double = (32.0 + 21.0) / 2;
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

   // Задача 7 - 8- 9
      val beta = Triple(9, 7, 2023);
      val mes = beta.first;
      val den = beta.second;
      val god = beta.third;
      println(beta);
      println("mes: $mes, god: $god");

   // Задача 10
      val alpha: Pair<Int, Int> = Pair(12, god);
      println(alpha);
}
