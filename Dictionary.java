abstract class PairMap{
    protected String []keyArray;
    protected String []valueArray;
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    Dictionary(int number){
        keyArray = new String[number];
        valueArray = new String[number];
        for(int i=0;i<10;i++){
            keyArray[i] = "null";
            valueArray[i] = "null";
        }
    }
    @Override
    int length() {
        int j=0;
        for(;j<10;j++){
            if(keyArray[j].equals("null")){
                return j;
            }
        }
        return j;
    }

    @Override
    String delete(String key) {
        String temp = null;
        for(int i=0;i<10;i++){
            if(keyArray[i].equals(key)){
                temp = valueArray[i];
                valueArray[i] = null;
            }
        }
        return temp;
    }

    @Override
    String get(String key) {
        String tmp = null;
        for(int i =0; i<10;i++){
            if(keyArray[i].equals(key)){
                tmp = valueArray[i];
                break;
            }
        }
        return tmp;
    }

    @Override
    void put(String key, String value) {
        for(int i=0;i<10;i++){
            if(keyArray[i].equals(key)){
                valueArray[i] = value;
                break;
            }
            if(keyArray[i].equals("null")){
                keyArray[i] = key;
                valueArray[i] = value;
                break;
            }
        }
    }
}
class DictionaryApp extends Dictionary{
    DictionaryApp(int number) {
        super(number);
    }
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문","파이선");
        dic.put("이재문", "c++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
