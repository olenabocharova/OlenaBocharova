public enum ClientType {
    naturalPerson("Физическое лицо"), legalPerson("Юридическое лицо");
private  String output;
//Метода для наглядного вывода типа клиента в консоль
    public String getOutput() {
        return output;
    }

    ClientType(String a) {
        output=a;
    }
}

