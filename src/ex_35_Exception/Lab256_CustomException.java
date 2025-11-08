package ex_35_Exception;

public class Lab256_CustomException {

    public static void main(String[] args) throws customException {
        Bank sbi=new Bank("INR",100);
        Bank ICICI=new Bank("INR",123);
        Integer total_bal= sbi.add(ICICI);
        System.out.println(total_bal);

        Bank jp_chase=new Bank("USD",101);
        Integer total_bal_all_countries=sbi.add(jp_chase);
        System.out.println(total_bal_all_countries);
    }

}
    class Bank {
        private String currency;
        private Integer amount;

        public Bank(String currency, Integer amount) {
            this.currency = currency;
            this.amount = amount;
        }


        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Integer add(Bank BankName) throws customException {
            if(!BankName.currency.equalsIgnoreCase("INR"))
            {
                throw new customException("Currency Mismatch,Can't proceed!!");
            }
            return BankName.amount+this.amount;
        }

    }

    class customException extends Exception{
        customException(String msg) {
            super(msg);
        }


    }

