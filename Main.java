public class Main {

    Sistema s;

    Usuario u;

    int opc;

    opc = menu2(s, u);

    while(opc != 0)

    {
        if (opc == 1) {
            seguir();
        } else if (opc == 2) {
            cadPostagem(s, u);
        } else if (opc = 3) {
            mostrarFeed();
        }
    }
}