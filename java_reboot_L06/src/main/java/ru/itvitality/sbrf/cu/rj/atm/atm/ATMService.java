package ru.itvitality.sbrf.cu.rj.atm.atm;

import java.io.IOException;

public interface ATMService {
    Integer getBalance();


    void saveToFile(String file_name) throws IOException;
}
