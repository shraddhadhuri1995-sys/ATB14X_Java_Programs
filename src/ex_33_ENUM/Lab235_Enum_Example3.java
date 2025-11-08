package ex_33_ENUM;

public class Lab235_Enum_Example3 {
    public static void main(String[] args) {
        System.out.println(HexCode.Black.getHexCode());
    }
}

enum HexCode{
    Black("#000000"),
    Red("#FF0000"),
    Blue("#0000FF"),
    ;

    private String hexCode;

    HexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }


}
