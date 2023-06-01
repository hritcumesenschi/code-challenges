public class BubbleSort implements SortingStrategy
{
    @Override
    public void sort(Integer[] list)
    {
        //
        boolean isSwapped;

        for(int i = 0; i < list.length - 1; ++i)
        {
            isSwapped = false;

            for(int j = 0; j < list.length - i - 1; ++j)
                if(list[j] > list[j + 1])
                {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;

                    isSwapped = true;
                }

            if(isSwapped == false)
                break;
        }
    }
}