package service;

public interface UtilService {
    int createRandomInteger(int start, int gap);
    double createRandomDouble(int start, int gap);

    String createRandomName();

    String createRandomText();
    String createRandomContent();
    String createRandomCompany();
    String createRandomUserName();
}
