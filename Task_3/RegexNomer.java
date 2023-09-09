import java.util.regex.*;
import java.util.HashMap;
public class RegexNomer {
    private String nomer;
    HashMap<String, String> reg = new HashMap<>();
    private void initHash(){ // Регионы
        reg.put("01","Республика Адыгея");
        reg.put("101","Республика Адыгея");
        reg.put("02","Республика Башкортостан");
        reg.put("102","Республика Башкортостан");
        reg.put("03","Республика Бурятия");
        reg.put("04","Республика Алтай");
        reg.put("18","Удмуртская Республика");
        reg.put("21","Чувашская Республика");
        reg.put("121","Чувашская Республика");
        reg.put("47","Ленинградская область");
        reg.put("147","Ленинградская область");
        reg.put("50","Московская область");
        reg.put("90","Московская область");
        reg.put("150","Московская область");
        reg.put("190","Московская область");
        reg.put("77","г. Москва");
        reg.put("97","г. Москва");
        reg.put("99","г. Москва");
        reg.put("177","г. Москва");
        reg.put("197","г. Москва");
        reg.put("199","г. Москва");
        reg.put("78","г. Санкт-Петербург");
        reg.put("98","г. Санкт-Петербург");
        reg.put("178","г. Санкт-Петербург");
    }
    public RegexNomer(){ // безусловный конструктор
        nomer = "";
        initHash();
    }
    public RegexNomer(String n){ // условный конструктор
        nomer = n;
        initHash();
    }
    public void getNomer(String n){ // геттер номера
        nomer = n;
    }
    private String findReg(int i){ // поиск информации о регионе
        /*Pattern pattern = Pattern.compile("\\d{2,3}$");
        Matcher matcher = pattern.matcher(nomer);*/
        if (reg.get(nomer.substring(i,nomer.length())) != null){
            return reg.get(nomer.substring(i,nomer.length()));
        }
        else {
            return "Региона "+nomer.substring(i,nomer.length())+" нет в базе.";
        }

    }
    public void Inf(){ // поиск информации о номере (11 возможных конфигураций номеров)
        Pattern pattern;
        if(Pattern.matches("^[A-Z]\\s?\\d{3}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\d{2,3}",nomer)) { // стандартный
            System.out.println("стандартный номер");
            pattern = Pattern.compile("[A-Z]\\s?\\d{3}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]{2}\\s?\\d{4}\\s?[A-Z]{0,3}\\s?\\d{2,3}",nomer)) { // прицеп, полуприцеп
            System.out.println("прицеп, полуприцеп");
            pattern = Pattern.compile("^[A-Z]{2}\\s?\\d{4}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^\\d{4}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // мотоцикл
            System.out.println("мотоцикл");
            pattern = Pattern.compile("^\\d{4}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]{2}\\s?\\d{2}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // мопед
            System.out.println("мопед");
            pattern = Pattern.compile("^[A-Z]{2}\\s?\\d{2}\\s?[A-Z]{2}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]{2}\\s?\\d{3}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // такси, автобус
            System.out.println("такси/автобус");
            pattern = Pattern.compile("^[A-Z]{2}\\s?\\d{3}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^\\d{3}\\s?[A-Z]{2}\\s?\\d\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // дипломаты
            System.out.println("транспорт посольства");
            pattern = Pattern.compile("^\\d{3}\\s?[A-Z]{2}\\s?\\d\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^\\d{3}\\s?[A-Z]\\s?\\d{3}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // тоже дипломаты
            System.out.println("транспорт посольства");
            pattern = Pattern.compile("^\\d{3}\\s?[A-Z]\\s?\\d{3}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]\\s?\\d{3}\\s?\\d{2}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // мотоциклы дипломатов
            System.out.println("мотоцикл посольства");
            pattern = Pattern.compile("^[A-Z]\\s?\\d{3}\\s?\\d{2}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]\\s?[A-Z]{2}\\s?\\d{3}\\s?//[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { //транзитный
            System.out.println("вероятно транзит");
            pattern = Pattern.compile("^[A-Z]\\s?[A-Z]{2}\\s?\\d{3}\\s?//[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^[A-Z]\\s?\\d{4}\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // МВД
            System.out.println("транспорт МВД");
            pattern = Pattern.compile("^[A-Z]\\s?\\d{4}\\s?[A-Z]{0,3}\\s?\\B");
        } else if(Pattern.matches("^\\d{3}\\s?[A-Z]\\s?[A-Z]{0,3}\\s?\\d{2,3}$",nomer)) { // МВД
            System.out.println("транспорт МВД");
            pattern = Pattern.compile("^\\d{3}\\s?[A-Z]\\s?[A-Z]{0,3}\\s?\\B");
        } else {
            System.out.println("Номер не существует");
            return;
        }
        Matcher matcher = pattern.matcher(nomer);
        while (matcher.find()){
            System.out.println(findReg(matcher.end())); // вызов метода поиска информации о регионе
        }
    }
}
