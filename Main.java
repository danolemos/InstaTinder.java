public class Main {

    Sistema s;

    Usuario u;

    int opc;

    opc = menu1(s, u);

    while(opc != 0)

    {
        if (opc == 1) {
            cadPessoa(s);
        } else if (opc == 2) {
            cadEmpresa(s);
        } else if (opc = 3) {
            login(s);
        }
    }
}
