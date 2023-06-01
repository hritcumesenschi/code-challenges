public class Pairs<T> {
    private Object first;
    private Object second;


    Pairs(Object firstElement, Object secondElement) throws IllegalArgumentException {
        //stage 1 requirements
        try {
            if (!firstElement.getClass().equals(secondElement.getClass())) throw new IllegalArgumentException("TypesDoNotMatchException");

            if(firstElement instanceof Running && secondElement instanceof Running) {
                if (((Running) firstElement).getSize() != ((Running) secondElement).getSize())
                    throw new IllegalArgumentException("SizesDoNotMatchException");

                if(((Running) firstElement).getColor() != ((Running) secondElement).getColor())
                    throw new IllegalArgumentException("ColorsDoNotMatchException");

            }

            if(firstElement instanceof Boot && secondElement instanceof Boot)
            {
                if(((Boot) firstElement).getSize() != ((Boot) secondElement).getSize())
                    throw new IllegalArgumentException("SizesDoNotMatchException");
                if(((Boot) firstElement).getColor() != ((Boot) secondElement).getColor())
                    throw new IllegalArgumentException("ColorsDoNotMatchException");

            }


            if(firstElement instanceof Heels && secondElement instanceof Heels)
            {
                if(((Heels) firstElement).getSize() != ((Heels) secondElement).getSize())
                    throw new IllegalArgumentException("SizesDoNotMatchException");

                if(((Heels) firstElement).getColor() != ((Heels) secondElement).getColor())
                    throw new IllegalArgumentException("ColorsDoNotMatchException");

            }

            first = firstElement;
            second = secondElement;


        } catch (IllegalArgumentException e) {
            System.err.format(e.getMessage() + "\n");
        }

    }

    public Object getFirst()
    {
        return  first;
    }

    public Object getSecond()
    {
        return second;
    }

}
