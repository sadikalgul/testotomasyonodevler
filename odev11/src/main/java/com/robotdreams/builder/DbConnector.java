package com.robotdreams.builder;


import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class DbConnector {
    private String serverName;
    private int serverPort;
    private String databaseName;
    private int  databaseTimeOut;
    private int dbPassWord;
}
