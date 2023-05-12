public class FooBarQix {
    String sentence = "";
    //we store in sentence if the number is divisible by 3,5 and 7

    String compute ( int number )
    {
        String appearance = "";

        if( number % 3 == 0 ) sentence+="Foo";
        if (number % 5  == 0 ) sentence+="Bar";
        if (number % 7== 0 ) sentence+="Qix";

        //we start to check if the digits of the number are 3,5 or 7;
        while(number > 0)
        {
            if(number % 10 == 3) appearance = "Foo" + appearance;
            else if (number % 10 == 5 ) appearance = "Bar" + appearance;
            else if (number % 10 == 7 ) appearance = "Qix" + appearance;

            number = number/10;
        }

        return sentence + appearance;
    };

    String compute2 (int number)
    {
        String appearance = "";
        if( number % 3 == 0 ) sentence+="Foo";
        if (number % 5  == 0 ) sentence+="Bar";
        if (number % 7== 0 ) sentence+="Qix";

        while(number > 0)
        {
            if(number % 10 == 0)appearance = "*" + appearance;
            else if(number % 10 == 3) appearance = "Foo" + appearance;
            else if (number % 10 == 5 ) appearance = "Bar" + appearance;
            else if (number % 10 == 7 ) appearance = "Qix" + appearance;
            number = number/10;
        }

        return sentence + appearance;
    };
}
