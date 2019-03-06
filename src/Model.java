public class Model {
    Integer A;
    Integer B;
    Integer addend1;
    Integer result1;
    String root;
    public String getRoot(String addend, String result, String IntervalA, String IntervalB)
    {
        try {
             A = Integer.parseInt(IntervalA);
             B = Integer.parseInt(IntervalB);
             addend1 = Integer.parseInt(addend);
             result1 = Integer.parseInt(result);
        }
        catch(NumberFormatException e){
            root="Введите целые числа";
            return root;
        }

        for(Integer num=A; num<B;num++) {
            if(num+addend1==result1) {
                root="Корень: " + (result1 - addend1);
            }
        }
        if(root==null)
            root="Нет корней";
        return root;
    }
}
