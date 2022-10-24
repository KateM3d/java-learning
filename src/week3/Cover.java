package week3;

public class Cover {

    public static void main(String[] args) {
        // boxing & unboxing
        byte varByte = 1;
        Byte boxedVarByte;
        boxedVarByte = Byte.valueOf(varByte);

        Byte boxedByte = 1;
        byte unboxedByte;
        unboxedByte = boxedByte;


        short varShort = 23000;
        Short boxedVarShort;
        boxedVarShort = Short.valueOf(varShort);

        Short boxedShort = 23000;
        short unboxedShort;
        unboxedShort = boxedShort;

        int varInt = 1000000;
        Integer boxedVarInt;
        boxedVarInt = Integer.valueOf(varInt);

        Integer boxedInt = 1000000;
        int unboxedInt;
        unboxedInt = boxedInt;

        long varLong = 12334456789L;
        Long boxedVarLong;
        boxedVarLong = varLong;

        Long boxedLong = 12334456789L;
        long unboxedLong;
        unboxedLong = boxedLong.longValue();

        float varFloat = 1.2F;
        Float boxedVarFloat;
        boxedVarFloat = varFloat;

        Float boxedFloat = 1.2F;
        float unboxedFloat;
        unboxedFloat = boxedFloat.floatValue();

        double varDouble = 1.02;
        Double boxedVarDouble;
        boxedVarDouble = new Double(varDouble);

        Double boxedDouble = 1.02;
        double unboxedDouble;
        unboxedDouble = boxedDouble.doubleValue();

        char varChar = 'b';
        Character boxedVarChar;
        boxedVarChar = new Character(varChar);

        Character boxedChar = 'b';
        char unboxedChar;
        unboxedChar = boxedChar.charValue();


        boolean varBoolean = true;
        Boolean boxedVarBoolean;
        boxedVarBoolean = new Boolean(varBoolean);

        Boolean boxedBoolean = false;
        boolean unboxedBoolean;
        unboxedBoolean = boxedBoolean.booleanValue();
//
//        System.out.println(boxedVarByte);
//        System.out.println(varShort);
//        System.out.println(varInt);
//        System.out.println(varLong);
//        System.out.println(varFloat);
//        System.out.println(varDouble);
//        System.out.println(varChar);
//        System.out.println(boxedVarBoolean);
    }
}
