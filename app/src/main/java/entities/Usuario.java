package entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by H4te on 11/21/2016.
 */
@DatabaseTable(tableName = "usuario")
public class Usuario {


    @DatabaseField(generatedId = true)
    private long id;
    @DatabaseField
    private String nombre;
    @DatabaseField
    private String apellido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
