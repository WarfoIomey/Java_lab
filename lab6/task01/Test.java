package lab6.task01;

public class Test {
    public char char_field;
    public String string_field;

    public void setCharOrStringField(char argurment) {
        this.char_field = argurment;
        System.out.println("Char");
        System.out.println(this.char_field);
    }
    public void setCharOrStringField(String argument) {
        this.string_field = argument;
        System.out.println("String");
        System.out.println(this.string_field);
    }
    public void setCharOrStringField(char [] charArray) {
        if (charArray.length == 1) {
           this.char_field = charArray[0];
            System.out.println("Array = 1");
            System.out.println(this.char_field);
        } else {
            String result = "";
            for (char element : charArray) {
                result += element + " ";
            }
            this.string_field = result;
            System.out.println("Array > 1");
            System.out.println(this.string_field);
        }
    }
}
