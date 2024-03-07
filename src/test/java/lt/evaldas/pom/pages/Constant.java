package lt.evaldas.pom.pages;

import lt.evaldas.pom.pages.seleniumesasy.BasicRadioButtonPage;

public class Constant {
    public enum BasicRadioButton {
        MALE("Male"),
        FEMALE("Female");

        public final String value;

        BasicRadioButton(String value) {
            this.value = value;
        }
    }
}
