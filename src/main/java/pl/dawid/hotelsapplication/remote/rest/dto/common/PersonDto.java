package pl.dawid.hotelsapplication.remote.rest.dto.common;

public class PersonDto {

    private String name;
    private String phone;
    private String address;
    private String mail;

    public PersonDto(String name, String phone, String address, String mail) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }
}
