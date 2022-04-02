package datadefinition;

import io.cucumber.java.DataTableType;
import model.RegistrarseInfo;

import java.util.Map;

public class RegistarUsuario {

    @DataTableType
    public RegistrarseInfo registrarseInfoEntry(Map<String, String> entry) {
        return new RegistrarseInfo(
                entry.get("nombres"),
                entry.get("apellidos"),
                entry.get("celular"),
                entry.get("correo"),
                entry.get("codigoReferencia"),
                entry.get("contrasena")
        );
    }
}
