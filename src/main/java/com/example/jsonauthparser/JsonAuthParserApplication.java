package com.example.jsonauthparser;

import Model.AuthToken;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class JsonAuthParserApplication {

	public static void main(String[] args) throws ParseException {

		SpringApplication.run(JsonAuthParserApplication.class, args);

		String json = "{\"access_token\":\"gmR9H-qZ2E_yPfh5w6smX8kwE9vEDH4BJ4JCHwuXW77NRQslEkzIk0AGiDA221WiLB5MtLf4l5wexXQA5qBIZsmN_Vwr61xyyaAdHLJPtdqJNhZDMoJkDWi5IHOPMVhT7IxlHF4pdTTG8Y-zdofYs5C8qHhTD_BDryvIP5wl8ZkAaLmeS7upE8pAQcl2BxtOyQc8Qq_zqLC589GcICKZc5wzjyhG70SQMwZ5xyhvQieYcvnAYugWnoMgI3ZwRgkPKS1zl0x5gJECneegX_KOhxY82BfWHqI0apZQseqAz4ruiHo6lJtuwC5M49An5lUfucWL3qRng63MnbVfJlOEMN2EiurrZ7T-RH24tciHGrsTxeca1u9cut8iliyythWVnWS7fv2X_3WII8aDdmhPe0nBsaXy3Ny0CXOuo_DTIF1BC51hzAUDV82FscF6KpyOD-iP1B8CO8h3XfabXdJePdQQUo1rj7qcWaLweoR-GC01C2tg2orKPWUnw7auVIETfSWrOgAmYPHbXgdqLwn8wUBlZJOf44hEvYNBchQklGymcwI3L_s4GsPc8NcgnVrSR6rU1Bc0QItnilYeun0_H5ewwgX3GArglysO9Ph_VdHNDIP5MAdf_22BYvw6yMccH5igqTWBdDlIWIJAiwmNyKkpJLQLBuo8JI41xvjQ_O7j3JBsu5Tx84VXIO_3M7S--hoBuGgUvNNiWhNTbukER_OqsQQ-CdGy_8qnMQMuiz9NiFQ2PBD_5f44aU59nqosAGCJgF2r6dRd8_vVw47rIqc-cOc6DgIg68bLR-T4pe9S194-rYqWE1x56Ji8BTOnikPPdRGzaiAAO2BaIey3Er4Bo6hYcUs6L2cih3jypa5Va8NBCgt7_eEDAFlKOG3KMdQFrAInRyVBklYMpTPh9aDdFzU88-nju-0DSNzJeukOt2kbqKRf7oKxnNixuiMlXc0EMlbQCsbS8-kqESL2aUNU0hOrPo6mpDb57SXVSEbL_K-qTtfNm6mYcGi0ddKzqtX-HaLbikK7l_nqrIXh7Q\"," +
				"\"token_type\": \"bearer\"," +
				"\"expires_in\": 86399," +
				"\".issued\": \"Fri, 29 May 2020 11:15:15 GMT\"," +
				"\".expires\": \"Sat, 30 May 2020 11:15:15 GMT\"}";

		Gson gson = new Gson();

		AuthToken token = gson.fromJson(json, AuthToken.class);

		System.out.println(token);
	}
}
