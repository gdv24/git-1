class RomeNumber{
    private String word;
    private int number;
    private String resultRome;

    public void setWord(String word){
        this.word = word;
    }
    public String getWord(){
        return word;
    }
    int searchRomeNumberIn() {
        String[] romeNumber = {"N", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < romeNumber.length; i++) {
            if (romeNumber[i].equals(word) == true) {
                number = i;
                break;
            }
        }
        return number;
    }
    public boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}