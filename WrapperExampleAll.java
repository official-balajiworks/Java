public class WrapperExampleAll {
    public static void main(String[] args) {
        // 🔹 int
        int a = 10;
        Integer objInt = Integer.valueOf(a);  // Boxing
        int unboxInt = objInt.intValue();     // Unboxing
        
        System.out.println("int -> Integer -> int");
        System.out.println("Primitive: " + a);
        System.out.println("Boxed: " + objInt);
        System.out.println("Unboxed: " + unboxInt);
        System.out.println("-----------------------------");

        // 🔹 float
        float f = 12.5f;
        Float objFloat = Float.valueOf(f);
        float unboxFloat = objFloat.floatValue();
        
        System.out.println("float -> Float -> float");
        System.out.println("Primitive: " + f);
        System.out.println("Boxed: " + objFloat);
        System.out.println("Unboxed: " + unboxFloat);
        System.out.println("-----------------------------");

        // 🔹 double
        double d = 99.99;
        Double objDouble = Double.valueOf(d);
        double unboxDouble = objDouble.doubleValue();
        
        System.out.println("double -> Double -> double");
        System.out.println("Primitive: " + d);
        System.out.println("Boxed: " + objDouble);
        System.out.println("Unboxed: " + unboxDouble);
        System.out.println("-----------------------------");

        // 🔹 char
        char c = 'A';
        Character objChar = Character.valueOf(c);
        char unboxChar = objChar.charValue();
        
        System.out.println("char -> Character -> char");
        System.out.println("Primitive: " + c);
        System.out.println("Boxed: " + objChar);
        System.out.println("Unboxed: " + unboxChar);
        System.out.println("-----------------------------");

        // 🔹 boolean
        boolean flag = true;
        Boolean objBool = Boolean.valueOf(flag);
        boolean unboxBool = objBool.booleanValue();
        
        System.out.println("boolean -> Boolean -> boolean");
        System.out.println("Primitive: " + flag);
        System.out.println("Boxed: " + objBool);
        System.out.println("Unboxed: " + unboxBool);
        System.out.println("-----------------------------");

        // 🔹 byte
        byte by = 100;
        Byte objByte = Byte.valueOf(by);
        byte unboxByte = objByte.byteValue();
        
        System.out.println("byte -> Byte -> byte");
        System.out.println("Primitive: " + by);
        System.out.println("Boxed: " + objByte);
        System.out.println("Unboxed: " + unboxByte);
        System.out.println("-----------------------------");

        // 🔹 short
        short s = 32000;
        Short objShort = Short.valueOf(s);
        short unboxShort = objShort.shortValue();
        
        System.out.println("short -> Short -> short");
        System.out.println("Primitive: " + s);
        System.out.println("Boxed: " + objShort);
        System.out.println("Unboxed: " + unboxShort);
        System.out.println("-----------------------------");

        // 🔹 long
        long l = 99999999L;
        Long objLong = Long.valueOf(l);
        long unboxLong = objLong.longValue();
        
        System.out.println("long -> Long -> long");
        System.out.println("Primitive: " + l);
        System.out.println("Boxed: " + objLong);
        System.out.println("Unboxed: " + unboxLong);
        System.out.println("-----------------------------");

        // 🔹 String (not a primitive)
        String str = "Hello Java!";
        // String is already an object, no boxing/unboxing needed
        System.out.println("String is already an object in Java: " + str);
    }
}
