import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class Tablero{
    JFrame ventana; // Etiqueta para crear la ventana
    JPanel panelBotones;//Se hace el panel de botones
    JLabel c0, c1,c2,c3,c4,c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22,c23, c24, c25, c26, c27, c28,c29, c30, c31, c32, c33, c34, c35, c36, c37, c38; //fila 1
    JLabel a0, a1,a2,a3,a4,a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22,a23, a24, a25;
    JLabel a26, a27, a28,a29, a30, a31, a32, a33, a34, a35, a36, a37, a38; //fila 2
    JLabel b0, b1,b2,b3,b4,b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,b23, b24, b25;
    JLabel b26, b27, b28,b29, b30, b31, b32, b33, b34, b35, b36, b37, b38; //fila 3
    JLabel d0, d1,d2,d3,d4,d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22,d23, d24, d25;
    JLabel d26, d27, d28,d29, d30, d31, d32, d33, d34, d35, d36, d37, d38; //fila 4
    JLabel e0, e1,e2,e3,e4,e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22,e23, e24, e25;
    JLabel e26, e27, e28,e29, e30, e31, e32, e33, e34, e35, e36, e37, e38; //fila 5
    JLabel f0, f1,f2,f3,f4,f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22,f23, f24, f25;
    JLabel f26, f27, f28,f29, f30, f31, f32, f33, f34, f35, f36, f37, f38; //fila 6
    JLabel g0, g1,g2,g3,g4,g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19, g20, g21, g22,g23, g24, g25;
    JLabel g26, g27, g28,g29, g30, g31, g32, g33, g34, g35, g36, g37, g38; //fila 7
    JLabel h0, h1,h2,h3,h4,h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22,h23, h24, h25;
    JLabel h26, h27, h28,h29, h30, h31, h32, h33, h34, h35, h36, h37, h38; //fila 8
    JLabel i0,i1,i2,i3,i4,i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22,i23, i24, i25;
    JLabel i26, i27, i28,i29, i30,i31, i32, i33, i34, i35, i36, i37, i38; //fila 9
    JLabel j0, j1,j2,j3,j4,j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22,j23, j24, j25;
    JLabel j26, j27, j28,j29, j30, j31, j32, j33, j34, j35, j36, j37, j38; //fila 10
    Color casilla,fondo;

    public Tablero(){
        ventana = new JFrame("Mapa"); //inicializa la ventana y le da el nombre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que la "x" cierre la ventana
        agregarComponentes();
        ventana.getContentPane().setBackground(fondo); //para agregar un fondo de color
        ventana.setPreferredSize(new Dimension(1850,750));
        ventana.setLocationRelativeTo(null);
        ventana.pack(); //Necesario para hacer la ventana 
        ventana.setVisible(true); //Hace la ventana visible 
    }
    public void agregarComponentes(){
        casilla=new Color(20,100,70); //Definicion del color de las casillas
        fondo=new Color(0,0,0); //Definicion del color de fondo
        c0= new JLabel(""); c16= new JLabel(""); c32= new JLabel(""); //Primer fila
        c1= new JLabel(""); c17= new JLabel(""); c33= new JLabel("");
        c2= new JLabel(""); c18= new JLabel(""); c34= new JLabel("");
        c3= new JLabel(""); c19= new JLabel(""); c35= new JLabel("");
        c4= new JLabel(""); c20= new JLabel(""); c36= new JLabel("");
        c5= new JLabel(""); c21= new JLabel(""); c37= new JLabel("");
        c6= new JLabel(""); c22= new JLabel(""); c38= new JLabel("");
        c7= new JLabel(""); c23= new JLabel(""); c10= new JLabel(""); c26= new JLabel("");
        c8= new JLabel(""); c24= new JLabel(""); c11= new JLabel(""); c27= new JLabel("");
        c9= new JLabel(""); c25= new JLabel("");  c12= new JLabel(""); c28= new JLabel("");
        c14= new JLabel(""); c30= new JLabel("");c13= new JLabel(""); c29= new JLabel("");
        c15= new JLabel(""); c31= new JLabel("");
        //Segunda fila
        a0= new JLabel(""); a16= new JLabel(""); a32= new JLabel(""); 
        a1= new JLabel(""); a17= new JLabel(""); a33= new JLabel("");
        a2= new JLabel(""); a18= new JLabel(""); a34= new JLabel("");
        a3= new JLabel(""); a19= new JLabel(""); a35= new JLabel("");
        a4= new JLabel(""); a20= new JLabel(""); a36= new JLabel("");
        a5= new JLabel(""); a21= new JLabel(""); a37= new JLabel("");
        a6= new JLabel(""); a22= new JLabel(""); a38= new JLabel("");
        a7= new JLabel(""); a23= new JLabel(""); 
        a8= new JLabel(""); a24= new JLabel(""); 
        a9= new JLabel(""); a25= new JLabel("");
        a10= new JLabel(""); a26= new JLabel("");
        a11= new JLabel(""); a27= new JLabel("");
        a12= new JLabel(""); a28= new JLabel("");
        a13= new JLabel(""); a29= new JLabel("");
        a14= new JLabel(""); a30= new JLabel("");
        a15= new JLabel(""); a31= new JLabel("");
         //tercera fila
         b0= new JLabel(""); b16= new JLabel(""); b32= new JLabel(""); 
         b1= new JLabel(""); b17= new JLabel(""); b33= new JLabel("");
         b2= new JLabel(""); b18= new JLabel(""); b34= new JLabel("");
         b3= new JLabel(""); b19= new JLabel(""); b35= new JLabel("");
         b4= new JLabel(""); b20= new JLabel(""); b36= new JLabel("");
         b5= new JLabel(""); b21= new JLabel(""); b37= new JLabel("");
         b6= new JLabel(""); b22= new JLabel(""); b38= new JLabel("");
         b7= new JLabel(""); b23= new JLabel(""); 
         b8= new JLabel(""); b24= new JLabel(""); 
         b9= new JLabel(""); b25= new JLabel("");
         b10= new JLabel(""); b26= new JLabel("");
         b11= new JLabel(""); b27= new JLabel("");
         b12= new JLabel(""); b28= new JLabel("");
         b13= new JLabel(""); b29= new JLabel("");
         b14= new JLabel(""); b30= new JLabel("");
         b15= new JLabel(""); b31= new JLabel("");
          //cuarta fila
          d0= new JLabel(""); d16= new JLabel(""); d32= new JLabel(""); 
          d1= new JLabel(""); d17= new JLabel(""); d33= new JLabel("");
          d2= new JLabel(""); d18= new JLabel(""); d34= new JLabel("");
          d3= new JLabel(""); d19= new JLabel(""); d35= new JLabel("");
          d4= new JLabel(""); d20= new JLabel(""); d36= new JLabel("");
          d5= new JLabel(""); d21= new JLabel(""); d37= new JLabel("");
          d6= new JLabel(""); d22= new JLabel(""); d38= new JLabel("");
          d7= new JLabel(""); d23= new JLabel(""); 
          d8= new JLabel(""); d24= new JLabel(""); 
          d9= new JLabel(""); d25= new JLabel("");
          d10= new JLabel(""); d26= new JLabel("");
          d11= new JLabel(""); d27= new JLabel("");
          d12= new JLabel(""); d28= new JLabel("");
          d13= new JLabel(""); d29= new JLabel("");
          d14= new JLabel(""); d30= new JLabel("");
          d15= new JLabel(""); d31= new JLabel("");
        //quinta fila
        e0= new JLabel(""); e16= new JLabel(""); e32= new JLabel(""); 
        e1= new JLabel(""); e17= new JLabel(""); e33= new JLabel("");
        e2= new JLabel(""); e18= new JLabel(""); e34= new JLabel("");
        e3= new JLabel(""); e19= new JLabel(""); e35= new JLabel("");
        e4= new JLabel(""); e20= new JLabel(""); e36= new JLabel("");
        e5= new JLabel(""); e21= new JLabel(""); e37= new JLabel("");
        e6= new JLabel(""); e22= new JLabel(""); e38= new JLabel("");
        e7= new JLabel(""); e23= new JLabel(""); 
        e8= new JLabel(""); e24= new JLabel(""); 
        e9= new JLabel(""); e25= new JLabel("");
        e10= new JLabel(""); e26= new JLabel("");
        e11= new JLabel(""); e27= new JLabel("");
        e12= new JLabel(""); e28= new JLabel("");
        e13= new JLabel(""); e29= new JLabel("");
        e14= new JLabel(""); e30= new JLabel("");
        e15= new JLabel(""); e31= new JLabel("");
        //sexta fila
        f0= new JLabel(""); f16= new JLabel(""); f32= new JLabel(""); 
        f1= new JLabel(""); f17= new JLabel(""); f33= new JLabel("");
        f2= new JLabel(""); f18= new JLabel(""); f34= new JLabel("");
        f3= new JLabel(""); f19= new JLabel(""); f35= new JLabel("");
        f4= new JLabel(""); f20= new JLabel(""); f36= new JLabel("");
        f5= new JLabel(""); f21= new JLabel(""); f37= new JLabel("");
        f6= new JLabel(""); f22= new JLabel(""); f38= new JLabel("");
        f7= new JLabel(""); f23= new JLabel(""); 
        f8= new JLabel(""); f24= new JLabel(""); 
        f9= new JLabel(""); f25= new JLabel("");
        f10= new JLabel(""); f26= new JLabel("");
        f11= new JLabel(""); f27= new JLabel("");
        f12= new JLabel(""); f28= new JLabel("");
        f13= new JLabel(""); f29= new JLabel("");
        f14= new JLabel(""); f30= new JLabel("");
        f15= new JLabel(""); f31= new JLabel("");
        //setima fila
        g0= new JLabel(""); g16= new JLabel(""); g32= new JLabel(""); 
        g1= new JLabel(""); g17= new JLabel(""); g33= new JLabel("");
        g2= new JLabel(""); g18= new JLabel(""); g34= new JLabel("");
        g3= new JLabel(""); g19= new JLabel(""); g35= new JLabel("");
        g4= new JLabel(""); g20= new JLabel(""); g36= new JLabel("");
        g5= new JLabel(""); g21= new JLabel(""); g37= new JLabel("");
        g6= new JLabel(""); g22= new JLabel(""); g38= new JLabel("");
        g7= new JLabel(""); g23= new JLabel(""); 
        g8= new JLabel(""); g24= new JLabel(""); 
        g9= new JLabel(""); g25= new JLabel("");
        g10= new JLabel(""); g26= new JLabel("");
        g11= new JLabel(""); g27= new JLabel("");
        g12= new JLabel(""); g28= new JLabel("");
        g13= new JLabel(""); g29= new JLabel("");
        g14= new JLabel(""); g30= new JLabel("");
        g15= new JLabel(""); g31= new JLabel("");
        //octava fila
        h0= new JLabel(""); h16= new JLabel(""); h32= new JLabel(""); 
        h1= new JLabel(""); h17= new JLabel(""); h33= new JLabel("");
        h2= new JLabel(""); h18= new JLabel(""); h34= new JLabel("");
        h3= new JLabel(""); h19= new JLabel(""); h35= new JLabel("");
        h4= new JLabel(""); h20= new JLabel(""); h36= new JLabel("");
        h5= new JLabel(""); h21= new JLabel(""); h37= new JLabel("");
        h6= new JLabel(""); h22= new JLabel(""); h38= new JLabel("");
        h7= new JLabel(""); h23= new JLabel(""); 
        h8= new JLabel(""); h24= new JLabel(""); 
        h9= new JLabel(""); h25= new JLabel("");
        h10= new JLabel(""); h26= new JLabel("");
        h11= new JLabel(""); h27= new JLabel("");
        h12= new JLabel(""); h28= new JLabel("");
        h13= new JLabel(""); h29= new JLabel("");
        h14= new JLabel(""); h30= new JLabel("");
        h15= new JLabel(""); h31= new JLabel("");
        //novena fila
        i0= new JLabel(""); i16= new JLabel(""); i32= new JLabel(""); 
        i1= new JLabel(""); i17= new JLabel(""); i33= new JLabel("");
        i2= new JLabel(""); i18= new JLabel(""); i34= new JLabel("");
        i3= new JLabel(""); i19= new JLabel(""); i35= new JLabel("");
        i4= new JLabel(""); i20= new JLabel(""); i36= new JLabel("");
        i5= new JLabel(""); i21= new JLabel(""); i37= new JLabel("");
        i6= new JLabel(""); i22= new JLabel(""); i38= new JLabel("");
        i7= new JLabel(""); i23= new JLabel(""); 
        i8= new JLabel(""); i24= new JLabel(""); 
        i9= new JLabel(""); i25= new JLabel("");
        i10= new JLabel("");i26= new JLabel("");
        i11= new JLabel(""); i27= new JLabel("");
        i12= new JLabel(""); i28= new JLabel("");
        i13= new JLabel(""); i29= new JLabel("");
        i14= new JLabel(""); i30= new JLabel("");
        i15= new JLabel(""); i31= new JLabel("");
        //decima fila
        j0= new JLabel(""); j16= new JLabel(""); j32= new JLabel(""); 
        j1= new JLabel(""); j17= new JLabel(""); j33= new JLabel("");
        j2= new JLabel(""); j18= new JLabel(""); j34= new JLabel("");
        j3= new JLabel(""); j19= new JLabel(""); j35= new JLabel("");
        j4= new JLabel(""); j20= new JLabel(""); j36= new JLabel("");
        j5= new JLabel(""); j21= new JLabel(""); j37= new JLabel("");
        j6= new JLabel(""); j22= new JLabel(""); j38= new JLabel("");
        j7= new JLabel(""); j23= new JLabel(""); 
        j8= new JLabel(""); j24= new JLabel(""); 
        j9= new JLabel(""); j25= new JLabel("");
        j10= new JLabel("");j26= new JLabel("");
        j11= new JLabel(""); j27= new JLabel("");
        j12= new JLabel(""); j28= new JLabel("");
        j13= new JLabel(""); j29= new JLabel("");
        j14= new JLabel(""); j30= new JLabel("");
        j15= new JLabel(""); j31= new JLabel("");
        
        ventana.setLayout(null);

        c0.setOpaque(true); //color de casillas- Primer fila
        c1.setOpaque(true);  c16.setOpaque(true);  c31.setOpaque(true);
        c2.setOpaque(true);  c17.setOpaque(true);  c32.setOpaque(true); 
        c3.setOpaque(true);  c18.setOpaque(true); c33.setOpaque(true);
        c4.setOpaque(true);  c19.setOpaque(true);  c34.setOpaque(true);
        c5.setOpaque(true);  c20.setOpaque(true);  c35.setOpaque(true);
        c6.setOpaque(true);  c21.setOpaque(true);  c36.setOpaque(true);
        c7.setOpaque(true);  c22.setOpaque(true);  c37.setOpaque(true);
        c8.setOpaque(true);  c23.setOpaque(true);  c38.setOpaque(true);
        c9.setOpaque(true);  c24.setOpaque(true); 
        c10.setOpaque(true);  c25.setOpaque(true); 
        c11.setOpaque(true);  c26.setOpaque(true);
        c12.setOpaque(true);  c27.setOpaque(true);
        c13.setOpaque(true);  c28.setOpaque(true);
        c14.setOpaque(true);  c29.setOpaque(true);
        c15.setOpaque(true);  c30.setOpaque(true);
        //Segunda fila
        a0.setOpaque(true); //color de casillas
        a1.setOpaque(true);  a16.setOpaque(true);  a31.setOpaque(true);
        a2.setOpaque(true);  a17.setOpaque(true);  a32.setOpaque(true);
        a3.setOpaque(true);  a18.setOpaque(true); a33.setOpaque(true);
        a4.setOpaque(true);  a19.setOpaque(true);  a34.setOpaque(true);
        a5.setOpaque(true);  a20.setOpaque(true);  a35.setOpaque(true);
        a6.setOpaque(true);  a21.setOpaque(true);  a36.setOpaque(true);
        a7.setOpaque(true);  a22.setOpaque(true);  a37.setOpaque(true);
        a8.setOpaque(true);  a23.setOpaque(true);  a38.setOpaque(true);
        a9.setOpaque(true);  a24.setOpaque(true); 
        a10.setOpaque(true);  a25.setOpaque(true); 
        a11.setOpaque(true);  a26.setOpaque(true);
        a12.setOpaque(true);  a27.setOpaque(true);
        a13.setOpaque(true);  a28.setOpaque(true);
        a14.setOpaque(true);  a29.setOpaque(true);
        a15.setOpaque(true);  a30.setOpaque(true);
        //Tercera fila
        b0.setOpaque(true); //color de casillas
        b1.setOpaque(true);  b16.setOpaque(true);  b31.setOpaque(true);
        b2.setOpaque(true);  b17.setOpaque(true);  b32.setOpaque(true);
        b3.setOpaque(true);  b18.setOpaque(true); b33.setOpaque(true);
        b4.setOpaque(true);  b19.setOpaque(true);  b34.setOpaque(true);
        b5.setOpaque(true);  b20.setOpaque(true);  b35.setOpaque(true);
        b6.setOpaque(true);  b21.setOpaque(true);  b36.setOpaque(true);
        b7.setOpaque(true);  b22.setOpaque(true);  b37.setOpaque(true);
        b8.setOpaque(true);  b23.setOpaque(true);  b38.setOpaque(true);
        b9.setOpaque(true);  b24.setOpaque(true); 
        b10.setOpaque(true);  b25.setOpaque(true); 
        b11.setOpaque(true);  b26.setOpaque(true);
        b12.setOpaque(true);  b27.setOpaque(true);
        b13.setOpaque(true);  b28.setOpaque(true);
        b14.setOpaque(true);  b29.setOpaque(true);
        b15.setOpaque(true);  b30.setOpaque(true);
        //Cuarta fila
        d0.setOpaque(true); 
        d1.setOpaque(true);  d16.setOpaque(true);  d31.setOpaque(true);
        d2.setOpaque(true);  d17.setOpaque(true);  d32.setOpaque(true); 
        d3.setOpaque(true);  d18.setOpaque(true); d33.setOpaque(true);
        d4.setOpaque(true);  d19.setOpaque(true);  d34.setOpaque(true);
        d5.setOpaque(true);  d20.setOpaque(true);  d35.setOpaque(true);
        d6.setOpaque(true);  d21.setOpaque(true);  d36.setOpaque(true);
        d7.setOpaque(true);  d22.setOpaque(true);  d37.setOpaque(true);
        d8.setOpaque(true);  d23.setOpaque(true);  d38.setOpaque(true);
        d9.setOpaque(true);  d24.setOpaque(true); 
        d10.setOpaque(true);  d25.setOpaque(true); 
        d11.setOpaque(true);  d26.setOpaque(true);
        d12.setOpaque(true);  d27.setOpaque(true);
        d13.setOpaque(true);  d28.setOpaque(true);
        d14.setOpaque(true);  d29.setOpaque(true);
        d15.setOpaque(true);  d30.setOpaque(true);
        //Quinta fila
        e0.setOpaque(true); //color de casillas
        e1.setOpaque(true);  e16.setOpaque(true);  e31.setOpaque(true);
        e2.setOpaque(true);  e17.setOpaque(true);  e32.setOpaque(true);
        e3.setOpaque(true);  e18.setOpaque(true); e33.setOpaque(true);
        e4.setOpaque(true);  e19.setOpaque(true);  e34.setOpaque(true);
        e5.setOpaque(true);  e20.setOpaque(true);  e35.setOpaque(true);
        e6.setOpaque(true);  e21.setOpaque(true);  e36.setOpaque(true);
        e7.setOpaque(true);  e22.setOpaque(true);  e37.setOpaque(true);
        e8.setOpaque(true);  e23.setOpaque(true);  e38.setOpaque(true);
        e9.setOpaque(true);  e24.setOpaque(true); 
        e10.setOpaque(true); e25.setOpaque(true); 
        e11.setOpaque(true);  e26.setOpaque(true);
        e12.setOpaque(true);  e27.setOpaque(true);
        e13.setOpaque(true);  e28.setOpaque(true);
        e14.setOpaque(true);  e29.setOpaque(true);
        e15.setOpaque(true);  e30.setOpaque(true);
        //sexta fila
        g0.setOpaque(true); //color de casillas
        g1.setOpaque(true);  g16.setOpaque(true);  g31.setOpaque(true);
        g2.setOpaque(true);  g17.setOpaque(true);  g32.setOpaque(true);
        g3.setOpaque(true);  g18.setOpaque(true); g33.setOpaque(true);
        g4.setOpaque(true);  g19.setOpaque(true);  g34.setOpaque(true);
        g5.setOpaque(true);  g20.setOpaque(true);  g35.setOpaque(true);
        g6.setOpaque(true);  g21.setOpaque(true);  g36.setOpaque(true);
        g7.setOpaque(true);  g22.setOpaque(true);  g37.setOpaque(true);
        g8.setOpaque(true);  g23.setOpaque(true);  g38.setOpaque(true);
        g9.setOpaque(true);  g24.setOpaque(true); 
        g10.setOpaque(true); g25.setOpaque(true); 
        g11.setOpaque(true);  g26.setOpaque(true);
        g12.setOpaque(true);  g27.setOpaque(true);
        g13.setOpaque(true);  g28.setOpaque(true);
        g14.setOpaque(true);  g29.setOpaque(true);
        g15.setOpaque(true);  g30.setOpaque(true);
        //Setima fila
        h0.setOpaque(true); //color de casillas
        h1.setOpaque(true);  h16.setOpaque(true);  h31.setOpaque(true);
        h2.setOpaque(true);  h17.setOpaque(true);  h32.setOpaque(true);
        h3.setOpaque(true);  h18.setOpaque(true); h33.setOpaque(true);
        h4.setOpaque(true);  h19.setOpaque(true);  h34.setOpaque(true);
        h5.setOpaque(true);  h20.setOpaque(true);  h35.setOpaque(true);
        h6.setOpaque(true);  h21.setOpaque(true);  h36.setOpaque(true);
        h7.setOpaque(true);  h22.setOpaque(true);  h37.setOpaque(true);
        h8.setOpaque(true);  h23.setOpaque(true);  h38.setOpaque(true);
        h9.setOpaque(true);  h24.setOpaque(true); 
        h10.setOpaque(true); h25.setOpaque(true); 
        h11.setOpaque(true);  h26.setOpaque(true);
        h12.setOpaque(true);  h27.setOpaque(true);
        h13.setOpaque(true);  h28.setOpaque(true);
        h14.setOpaque(true);  h29.setOpaque(true);
        h15.setOpaque(true); h30.setOpaque(true);
        //octava fila
        f0.setOpaque(true); //color de casillas
        f1.setOpaque(true);  f16.setOpaque(true);  f31.setOpaque(true);
        f2.setOpaque(true);  f17.setOpaque(true);  f32.setOpaque(true);
        f3.setOpaque(true);  f18.setOpaque(true); f33.setOpaque(true);
        f4.setOpaque(true);  f19.setOpaque(true);  f34.setOpaque(true);
        f5.setOpaque(true);  f20.setOpaque(true);  f35.setOpaque(true);
        f6.setOpaque(true);  f21.setOpaque(true);  f36.setOpaque(true);
        f7.setOpaque(true);  f22.setOpaque(true);  f37.setOpaque(true);
        f8.setOpaque(true);  f23.setOpaque(true);  f38.setOpaque(true);
        f9.setOpaque(true);  f24.setOpaque(true); 
        f10.setOpaque(true); f25.setOpaque(true); 
        f11.setOpaque(true);  f26.setOpaque(true);
        f12.setOpaque(true);  f27.setOpaque(true);
        f13.setOpaque(true);  f28.setOpaque(true);
        f14.setOpaque(true);  f29.setOpaque(true);
        f15.setOpaque(true);f30.setOpaque(true);
        //novena fila
        i0.setOpaque(true); //color de casillas
        i1.setOpaque(true);  i16.setOpaque(true);  i31.setOpaque(true);
        i2.setOpaque(true);  i17.setOpaque(true);  i32.setOpaque(true);
        i3.setOpaque(true);  i18.setOpaque(true); i33.setOpaque(true);
        i4.setOpaque(true);  i19.setOpaque(true);  i34.setOpaque(true);
        i5.setOpaque(true);  i20.setOpaque(true);  i35.setOpaque(true);
        i6.setOpaque(true);  i21.setOpaque(true);  i36.setOpaque(true);
        i7.setOpaque(true);  i22.setOpaque(true);  i37.setOpaque(true);
        i8.setOpaque(true);  i23.setOpaque(true);  i38.setOpaque(true);
        i9.setOpaque(true);  i24.setOpaque(true); 
        i10.setOpaque(true); i25.setOpaque(true); 
        i11.setOpaque(true);  i26.setOpaque(true);
        i12.setOpaque(true);  i27.setOpaque(true);
        i13.setOpaque(true);  i28.setOpaque(true);
        i14.setOpaque(true);  i29.setOpaque(true);
        i15.setOpaque(true);i30.setOpaque(true);
        //decima fila
        j0.setOpaque(true); //color de casillas
        j1.setOpaque(true);  j16.setOpaque(true);  j31.setOpaque(true);
        j2.setOpaque(true);  j17.setOpaque(true);  j32.setOpaque(true);
        j3.setOpaque(true);  j18.setOpaque(true); j33.setOpaque(true);
        j4.setOpaque(true);  j19.setOpaque(true);  j34.setOpaque(true);
        j5.setOpaque(true);  j20.setOpaque(true);  j35.setOpaque(true);
        j6.setOpaque(true);  j21.setOpaque(true);  j36.setOpaque(true);
        j7.setOpaque(true);  j22.setOpaque(true);  j37.setOpaque(true);
        j8.setOpaque(true);  j23.setOpaque(true);  j38.setOpaque(true);
        j9.setOpaque(true);  j24.setOpaque(true); 
        j10.setOpaque(true); j25.setOpaque(true); 
        j11.setOpaque(true);  j26.setOpaque(true);
        j12.setOpaque(true);  f27.setOpaque(true);
        j13.setOpaque(true);  j28.setOpaque(true);
        j14.setOpaque(true);  j29.setOpaque(true);
        j15.setOpaque(true);j30.setOpaque(true);
    
        c0.setBackground(casilla); c16.setBackground(casilla);  c32.setBackground(casilla);
        c1.setBackground(casilla); c17.setBackground(casilla); c33.setBackground(casilla);
        c2.setBackground(casilla); c18.setBackground(casilla); c34.setBackground(casilla);
        c3.setBackground(casilla); c19.setBackground(casilla); c35.setBackground(casilla);
        c4.setBackground(casilla); c20.setBackground(casilla); c36.setBackground(casilla);
        c5.setBackground(casilla); c21.setBackground(casilla);  c37.setBackground(casilla);
        c6.setBackground(casilla); c22.setBackground(casilla);  c38.setBackground(casilla);
        c7.setBackground(casilla); c23.setBackground(casilla); 
        c8.setBackground(casilla); c24.setBackground(casilla);  
        c9.setBackground(casilla); c25.setBackground(casilla);
        c10.setBackground(casilla); c26.setBackground(casilla);
        c11.setBackground(casilla); c27.setBackground(casilla);
        c12.setBackground(casilla); c28.setBackground(casilla);
        c13.setBackground(casilla); c29.setBackground(casilla);
        c14.setBackground(casilla); c30.setBackground(casilla);
        c15.setBackground(casilla); c31.setBackground(casilla);
        //Segunda fila
        a0.setBackground(casilla); a16.setBackground(casilla);  a32.setBackground(casilla);
        a1.setBackground(casilla); a17.setBackground(casilla); a33.setBackground(casilla);
        a2.setBackground(casilla); a18.setBackground(casilla); a34.setBackground(casilla);
        a3.setBackground(casilla); a19.setBackground(casilla); a35.setBackground(casilla);
        a4.setBackground(casilla); a20.setBackground(casilla); a36.setBackground(casilla);
        a5.setBackground(casilla); a21.setBackground(casilla);  a37.setBackground(casilla);
        a6.setBackground(casilla); a22.setBackground(casilla);  a38.setBackground(casilla);
        a7.setBackground(casilla); a23.setBackground(casilla); 
        a8.setBackground(casilla); a24.setBackground(casilla);  
        a9.setBackground(casilla); a25.setBackground(casilla);
        a10.setBackground(casilla); a26.setBackground(casilla);
        a11.setBackground(casilla); a27.setBackground(casilla);
        a12.setBackground(casilla); a28.setBackground(casilla);
        a13.setBackground(casilla); a29.setBackground(casilla);
        a14.setBackground(casilla); a30.setBackground(casilla);
        a15.setBackground(casilla); a31.setBackground(casilla);
        //tercera fila
        b0.setBackground(casilla); b16.setBackground(casilla);  b32.setBackground(casilla);
        b1.setBackground(casilla); b17.setBackground(casilla); b33.setBackground(casilla);
        b2.setBackground(casilla); b18.setBackground(casilla); b34.setBackground(casilla);
        b3.setBackground(casilla); b19.setBackground(casilla); b35.setBackground(casilla);
        b4.setBackground(casilla); b20.setBackground(casilla); b36.setBackground(casilla);
        b5.setBackground(casilla); b21.setBackground(casilla);  b37.setBackground(casilla);
        b6.setBackground(casilla); b22.setBackground(casilla);  b38.setBackground(casilla);
        b7.setBackground(casilla); b23.setBackground(casilla); 
        b8.setBackground(casilla); b24.setBackground(casilla);  
        b9.setBackground(casilla); b25.setBackground(casilla);
        b10.setBackground(casilla); b26.setBackground(casilla);
        b11.setBackground(casilla); b27.setBackground(casilla);
        b12.setBackground(casilla); b28.setBackground(casilla);
        b13.setBackground(casilla); b29.setBackground(casilla);
        b14.setBackground(casilla); b30.setBackground(casilla);
        b15.setBackground(casilla); b31.setBackground(casilla);
        //Cuarta fila
        d0.setBackground(casilla); b16.setBackground(casilla);  d32.setBackground(casilla);
        d1.setBackground(casilla); b17.setBackground(casilla); d33.setBackground(casilla);
        d2.setBackground(casilla); b18.setBackground(casilla); d34.setBackground(casilla);
        d3.setBackground(casilla); b19.setBackground(casilla); d35.setBackground(casilla);
        d4.setBackground(casilla); b20.setBackground(casilla); d36.setBackground(casilla);
        d5.setBackground(casilla); b21.setBackground(casilla);  d37.setBackground(casilla);
        d6.setBackground(casilla); b22.setBackground(casilla);  d38.setBackground(casilla);
        d7.setBackground(casilla); b23.setBackground(casilla); 
        d8.setBackground(casilla); b24.setBackground(casilla);  
        d9.setBackground(casilla); b25.setBackground(casilla);
        d10.setBackground(casilla); b26.setBackground(casilla);
        d11.setBackground(casilla); b27.setBackground(casilla);
        d12.setBackground(casilla); b28.setBackground(casilla);
        d13.setBackground(casilla); b29.setBackground(casilla);
        d14.setBackground(casilla); b30.setBackground(casilla);
        d15.setBackground(casilla); b31.setBackground(casilla);
        //Quinta fila
        e0.setBackground(casilla); e16.setBackground(casilla);  e32.setBackground(casilla);
        e1.setBackground(casilla); e17.setBackground(casilla); e33.setBackground(casilla);
        e2.setBackground(casilla); e18.setBackground(casilla); e34.setBackground(casilla);
        e3.setBackground(casilla); e19.setBackground(casilla); e35.setBackground(casilla);
        e4.setBackground(casilla); e20.setBackground(casilla); e36.setBackground(casilla);
        e5.setBackground(casilla); e21.setBackground(casilla);  e37.setBackground(casilla);
        e6.setBackground(casilla); e22.setBackground(casilla);  e38.setBackground(casilla);
        e7.setBackground(casilla); e23.setBackground(casilla); 
        e8.setBackground(casilla); e24.setBackground(casilla);  
        e9.setBackground(casilla); e25.setBackground(casilla);
        e10.setBackground(casilla); e26.setBackground(casilla);
        e11.setBackground(casilla); e27.setBackground(casilla);
        e12.setBackground(casilla); e28.setBackground(casilla);
        e13.setBackground(casilla); e29.setBackground(casilla);
        e14.setBackground(casilla); e30.setBackground(casilla);
        e15.setBackground(casilla); e31.setBackground(casilla);
        //sexto fila
        g0.setBackground(casilla); g16.setBackground(casilla);  g32.setBackground(casilla);
        g1.setBackground(casilla); g17.setBackground(casilla); g33.setBackground(casilla);
        g2.setBackground(casilla); g18.setBackground(casilla); g34.setBackground(casilla);
        g3.setBackground(casilla); g19.setBackground(casilla); g35.setBackground(casilla);
        g4.setBackground(casilla); g20.setBackground(casilla); g36.setBackground(casilla);
        g5.setBackground(casilla); g21.setBackground(casilla);  g37.setBackground(casilla);
        g6.setBackground(casilla); g22.setBackground(casilla);  g38.setBackground(casilla);
        g7.setBackground(casilla); g23.setBackground(casilla); 
        g8.setBackground(casilla); g24.setBackground(casilla);  
        g9.setBackground(casilla); g25.setBackground(casilla);
        g10.setBackground(casilla); g26.setBackground(casilla);
        g11.setBackground(casilla); g27.setBackground(casilla);
        g12.setBackground(casilla); g28.setBackground(casilla);
        g13.setBackground(casilla); g29.setBackground(casilla);
        g14.setBackground(casilla); g30.setBackground(casilla);
        g15.setBackground(casilla); g31.setBackground(casilla);
        //setima fila
        h0.setBackground(casilla); h16.setBackground(casilla);  h32.setBackground(casilla);
        h1.setBackground(casilla); h17.setBackground(casilla); h33.setBackground(casilla);
        h2.setBackground(casilla); h18.setBackground(casilla); h34.setBackground(casilla);
        h3.setBackground(casilla); h19.setBackground(casilla); h35.setBackground(casilla);
        h4.setBackground(casilla); h20.setBackground(casilla); h36.setBackground(casilla);
        h5.setBackground(casilla); h21.setBackground(casilla);  h37.setBackground(casilla);
        h6.setBackground(casilla); h22.setBackground(casilla);  h38.setBackground(casilla);
        h7.setBackground(casilla); h23.setBackground(casilla); 
        h8.setBackground(casilla); h24.setBackground(casilla);  
        h9.setBackground(casilla); h25.setBackground(casilla);
        h10.setBackground(casilla); h26.setBackground(casilla);
        h11.setBackground(casilla); h27.setBackground(casilla);
        h12.setBackground(casilla); h28.setBackground(casilla);
        h13.setBackground(casilla); h29.setBackground(casilla);
        h14.setBackground(casilla); h30.setBackground(casilla);
        h15.setBackground(casilla); h31.setBackground(casilla);
        //octava fila
        f0.setBackground(casilla); f16.setBackground(casilla);  f32.setBackground(casilla);
        f1.setBackground(casilla); f17.setBackground(casilla); f33.setBackground(casilla);
        f2.setBackground(casilla); f18.setBackground(casilla); f34.setBackground(casilla);
        f3.setBackground(casilla); f19.setBackground(casilla); f35.setBackground(casilla);
        f4.setBackground(casilla); f20.setBackground(casilla); f36.setBackground(casilla);
        f5.setBackground(casilla); f21.setBackground(casilla); f37.setBackground(casilla);
        f6.setBackground(casilla); f22.setBackground(casilla);  f38.setBackground(casilla);
        f7.setBackground(casilla); f23.setBackground(casilla); 
        f8.setBackground(casilla); f24.setBackground(casilla);  
        f9.setBackground(casilla); f25.setBackground(casilla);
        f10.setBackground(casilla); f26.setBackground(casilla);
        f11.setBackground(casilla); f27.setBackground(casilla);
        f12.setBackground(casilla); f28.setBackground(casilla);
        f13.setBackground(casilla); f29.setBackground(casilla);
        f14.setBackground(casilla); f30.setBackground(casilla);
        f15.setBackground(casilla); f31.setBackground(casilla);
        //novena fila
        i0.setBackground(casilla); i16.setBackground(casilla);  i32.setBackground(casilla);
        i1.setBackground(casilla); i17.setBackground(casilla); i33.setBackground(casilla);
        i2.setBackground(casilla); i18.setBackground(casilla); i34.setBackground(casilla);
        i3.setBackground(casilla); i19.setBackground(casilla); i35.setBackground(casilla);
        i4.setBackground(casilla); i20.setBackground(casilla); i36.setBackground(casilla);
        i5.setBackground(casilla); i21.setBackground(casilla); i37.setBackground(casilla);
        i6.setBackground(casilla); i22.setBackground(casilla);  i38.setBackground(casilla);
        i7.setBackground(casilla); i23.setBackground(casilla); 
        i8.setBackground(casilla); i24.setBackground(casilla);  
        i9.setBackground(casilla); i25.setBackground(casilla);
        i10.setBackground(casilla); i26.setBackground(casilla);
        i11.setBackground(casilla); i27.setBackground(casilla);
        i12.setBackground(casilla); i28.setBackground(casilla);
        i13.setBackground(casilla); i29.setBackground(casilla);
        i14.setBackground(casilla); i30.setBackground(casilla);
        i15.setBackground(casilla); i31.setBackground(casilla);
        //decima fila
        j0.setBackground(casilla); j16.setBackground(casilla);  j32.setBackground(casilla);
        j1.setBackground(casilla); j17.setBackground(casilla); j33.setBackground(casilla);
        j2.setBackground(casilla); j18.setBackground(casilla); j34.setBackground(casilla);
        j3.setBackground(casilla); j19.setBackground(casilla); j35.setBackground(casilla);
        j4.setBackground(casilla); j20.setBackground(casilla); j36.setBackground(casilla);
        j5.setBackground(casilla); j21.setBackground(casilla); j37.setBackground(casilla);
        j6.setBackground(casilla); j22.setBackground(casilla);  j38.setBackground(casilla);
        j7.setBackground(casilla); j23.setBackground(casilla); 
        j8.setBackground(casilla); j24.setBackground(casilla);  
        j9.setBackground(casilla); j25.setBackground(casilla);
        j10.setBackground(casilla);j26.setBackground(casilla);
        j11.setBackground(casilla); j27.setBackground(casilla);
        j12.setBackground(casilla); j28.setBackground(casilla);
        j13.setBackground(casilla); j29.setBackground(casilla);
        j14.setBackground(casilla); j30.setBackground(casilla);
        j15.setBackground(casilla); j31.setBackground(casilla);

        c0.setBounds(10,10,30,30); //posiciones de las casillas y tamaño
        c1.setBounds(45,10,30,30); c16.setBounds(570,10,30,30); c31.setBounds(1095,10,30,30);
        c2.setBounds(80,10,30,30); c17.setBounds(605,10,30,30); c32.setBounds(1130,10,30,30);
        c3.setBounds(115,10,30,30); c18.setBounds(640,10,30,30); c33.setBounds(1165,10,30,30);
        c4.setBounds(150,10,30,30); c19.setBounds(675,10,30,30); c34.setBounds(1200,10,30,30);
        c5.setBounds(185,10,30,30); c20.setBounds(710,10,30,30); c35.setBounds(1235,10,30,30);
        c6.setBounds(220,10,30,30); c21.setBounds(745,10,30,30); c36.setBounds(1270,10,30,30);
        c7.setBounds(255,10,30,30); c22.setBounds(780,10,30,30); c37.setBounds(1305,10,30,30);
        c8.setBounds(290,10,30,30); c23.setBounds(815,10,30,30); c38.setBounds(1338,10,30,30);
        c9.setBounds(325,10,30,30); c24.setBounds(850,10,30,30); 
        c10.setBounds(360,10,30,30); c25.setBounds(885,10,30,30); 
        c11.setBounds(395,10,30,30); c26.setBounds(920,10,30,30);
        c12.setBounds(430,10,30,30); c27.setBounds(955,10,30,30);
        c13.setBounds(465,10,30,30); c28.setBounds(990,10,30,30);
        c14.setBounds(500,10,30,30); c29.setBounds(1025,10,30,30);
        c15.setBounds(535,10,30,30); c30.setBounds(1060,10,30,30);
        //Segunda fila
        a0.setBounds(10,45,30,30); //posiciones de las casillas y tamaño
        a1.setBounds(45,45,30,30); a16.setBounds(570,45,30,30); a31.setBounds(1095,45,30,30);
        a2.setBounds(80,45,30,30); a17.setBounds(605,45,30,30); a32.setBounds(1130,45,30,30);
        a3.setBounds(115,45,30,30); a18.setBounds(640,45,30,30); a33.setBounds(1165,45,30,30);
        a4.setBounds(150,45,30,30); a19.setBounds(675,45,30,30); a34.setBounds(1200,45,30,30);
        a5.setBounds(185,45,30,30); a20.setBounds(710,45,30,30); a35.setBounds(1235,45,30,30);
        a6.setBounds(220,45,30,30); a21.setBounds(745,45,30,30); a36.setBounds(1270,45,30,30);
        a7.setBounds(255,45,30,30); a22.setBounds(780,45,30,30); a37.setBounds(1305,45,30,30);
        a8.setBounds(290,45,30,30); a23.setBounds(815,45,30,30); a38.setBounds(1338,45,30,30);
        a9.setBounds(325,45,30,30); a24.setBounds(850,45,30,30); 
        a10.setBounds(360,45,30,30); a25.setBounds(885,45,30,30); 
        a11.setBounds(395,45,30,30); a26.setBounds(920,45,30,30);
        a12.setBounds(430,45,30,30); a27.setBounds(955,45,30,30);
        a13.setBounds(465,45,30,30); a28.setBounds(990,45,30,30);
        a14.setBounds(500,45,30,30); a29.setBounds(1025,45,30,30);
        a15.setBounds(535,45,30,30); a30.setBounds(1060,45,30,30);
        //Tercera fila
        b0.setBounds(10,80,30,30); //posiciones de las casillas y tamaño
        b1.setBounds(45,80,30,30); b16.setBounds(570,80,30,30); b31.setBounds(1095,80,30,30);
        b2.setBounds(80,80,30,30); b17.setBounds(605,80,30,30); b32.setBounds(1130,80,30,30);
        b3.setBounds(115,80,30,30); b18.setBounds(640,80,30,30); b33.setBounds(1165,80,30,30);
        b4.setBounds(150,80,30,30); b19.setBounds(675,80,30,30); b34.setBounds(1200,80,30,30);
        b5.setBounds(185,80,30,30); b20.setBounds(710,80,30,30); b35.setBounds(1235,80,30,30);
        b6.setBounds(220,80,30,30); b21.setBounds(745,80,30,30); b36.setBounds(1270,80,30,30);
        b7.setBounds(255,80,30,30); b22.setBounds(780,80,30,30); b37.setBounds(1305,80,30,30);
        b8.setBounds(290,80,30,30); b23.setBounds(815,80,30,30); b38.setBounds(1338,80,30,30);
        b9.setBounds(325,80,30,30); b24.setBounds(850,80,30,30); 
        b10.setBounds(360,80,30,30); b25.setBounds(885,80,30,30); 
        b11.setBounds(395,80,30,30); b26.setBounds(920,80,30,30);
        b12.setBounds(430,80,30,30); b27.setBounds(955,80,30,30);
        b13.setBounds(465,80,30,30); b28.setBounds(990,80,30,30);
        b14.setBounds(500,80,30,30); b29.setBounds(1025,80,30,30);
        b15.setBounds(535,80,30,30); b30.setBounds(1060,80,30,30);
        //cuarta fila
        d0.setBounds(10,115,30,30); //posiciones de las casillas y tamaño
        d1.setBounds(45,115,30,30); d16.setBounds(570,115,30,30); d31.setBounds(1095,115,30,30);
        d2.setBounds(80,115,30,30); d17.setBounds(605,115,30,30); d32.setBounds(1130,115,30,30);
        d3.setBounds(115,115,30,30); d18.setBounds(640,115,30,30); d33.setBounds(1165,115,30,30);
        d4.setBounds(150,115,30,30); d19.setBounds(675,115,30,30); d34.setBounds(1200,115,30,30);
        d5.setBounds(185,115,30,30); d20.setBounds(710,115,30,30); d35.setBounds(1235,115,30,30);
        d6.setBounds(220,115,30,30); d21.setBounds(745,115,30,30); d36.setBounds(1270,115,30,30);
        d7.setBounds(255,115,30,30); d22.setBounds(780,115,30,30); d37.setBounds(1305,115,30,30);
        d8.setBounds(290,115,30,30); d23.setBounds(815,115,30,30); d38.setBounds(1338,115,30,30);
        d9.setBounds(325,115,30,30); d24.setBounds(850,115,30,30); 
        d10.setBounds(360,115,30,30); d25.setBounds(885,115,30,30); 
        d11.setBounds(395,115,30,30); d26.setBounds(920,115,30,30);
        d12.setBounds(430,115,30,30); d27.setBounds(955,115,30,30);
        d13.setBounds(465,115,30,30); d28.setBounds(990,115,30,30);
        d14.setBounds(500,115,30,30); d29.setBounds(1025,115,30,30);
        d15.setBounds(535,115,30,30); d30.setBounds(1060,115,30,30);
         //Quinta fila
         e0.setBounds(10,150,30,30); //posiciones de las casillas y tamaño
         e1.setBounds(45,150,30,30); e16.setBounds(570,150,30,30); e31.setBounds(1095,150,30,30);
         e2.setBounds(80,150,30,30); e17.setBounds(605,150,30,30); e32.setBounds(1130,150,30,30);
         e3.setBounds(115,150,30,30); e18.setBounds(640,150,30,30); e33.setBounds(1165,150,30,30);
         e4.setBounds(150,150,30,30); e19.setBounds(675,150,30,30); e34.setBounds(1200,150,30,30);
         e5.setBounds(185,150,30,30); e20.setBounds(710,150,30,30); e35.setBounds(1235,150,30,30);
         e6.setBounds(220,150,30,30); e21.setBounds(745,150,30,30); e36.setBounds(1270,150,30,30);
         e7.setBounds(255,150,30,30); e22.setBounds(780,150,30,30); e37.setBounds(1305,150,30,30);
         e8.setBounds(290,150,30,30); e23.setBounds(815,150,30,30); e38.setBounds(1338,150,30,30);
         e9.setBounds(325,150,30,30); e24.setBounds(850,150,30,30); 
         e10.setBounds(360,150,30,30); e25.setBounds(885,150,30,30); 
         e11.setBounds(395,150,30,30); e26.setBounds(920,150,30,30);
         e12.setBounds(430,150,30,30); e27.setBounds(955,150,30,30);
         e13.setBounds(465,150,30,30); e28.setBounds(990,150,30,30);
         e14.setBounds(500,150,30,30); e29.setBounds(1025,150,30,30);
         e15.setBounds(535,150,30,30); e30.setBounds(1060,150,30,30);
        //sexta fila
        g0.setBounds(10,185,30,30); //posiciones de las casillas y tamaño
        g1.setBounds(45,185,30,30); g16.setBounds(570,185,30,30); g31.setBounds(1095,185,30,30);
        g2.setBounds(80,185,30,30); g17.setBounds(605,185,30,30); g32.setBounds(1130,185,30,30);
        g3.setBounds(115,185,30,30); g18.setBounds(640,185,30,30); g33.setBounds(1165,185,30,30);
        g4.setBounds(150,185,30,30); g19.setBounds(675,185,30,30); g34.setBounds(1200,185,30,30);
        g5.setBounds(185,185,30,30); g20.setBounds(710,185,30,30); g35.setBounds(1235,185,30,30);
        g6.setBounds(220,185,30,30); g21.setBounds(745,185,30,30); g36.setBounds(1270,185,30,30);
        g7.setBounds(255,185,30,30); g22.setBounds(780,185,30,30); g37.setBounds(1305,185,30,30);
        g8.setBounds(290,185,30,30); g23.setBounds(815,185,30,30); g38.setBounds(1338,185,30,30);
        g9.setBounds(325,185,30,30); g24.setBounds(850,185,30,30); 
        g10.setBounds(360,185,30,30); g25.setBounds(885,185,30,30); 
        g11.setBounds(395,185,30,30); g26.setBounds(920,185,30,30);
        g12.setBounds(430,185,30,30); g27.setBounds(955,185,30,30);
        g13.setBounds(465,185,30,30); g28.setBounds(990,185,30,30);
        g14.setBounds(500,185,30,30); g29.setBounds(1025,185,30,30);
        g15.setBounds(535,185,30,30); g30.setBounds(1060,185,30,30);
        //Setima fila
        h0.setBounds(10,220,30,30); //posiciones de las casillas y tamaño
        h1.setBounds(45,220,30,30); h16.setBounds(570,220,30,30); h31.setBounds(1095,220,30,30);
        h2.setBounds(80,220,30,30); h17.setBounds(605,220,30,30); h32.setBounds(1130,220,30,30);
        h3.setBounds(115,220,30,30); h18.setBounds(640,220,30,30); h33.setBounds(1165,220,30,30);
        h4.setBounds(150,220,30,30); h19.setBounds(675,220,30,30); h34.setBounds(1200,220,30,30);
        h5.setBounds(185,220,30,30); h20.setBounds(710,220,30,30); h35.setBounds(1235,220,30,30);
        h6.setBounds(220,220,30,30); h21.setBounds(745,220,30,30); h36.setBounds(1270,220,30,30);
        h7.setBounds(255,220,30,30); h22.setBounds(780,220,30,30); h37.setBounds(1305,220,30,30);
        h8.setBounds(290,220,30,30); h23.setBounds(815,220,30,30); h38.setBounds(1338,220,30,30);
        h9.setBounds(325,220,30,30); h24.setBounds(850,220,30,30); 
        h10.setBounds(360,220,30,30); h25.setBounds(885,220,30,30); 
        h11.setBounds(395,220,30,30); h26.setBounds(920,220,30,30);
        h12.setBounds(430,220,30,30); h27.setBounds(955,220,30,30);
        h13.setBounds(465,220,30,30); h28.setBounds(990,220,30,30);
        h14.setBounds(500,220,30,30); h29.setBounds(1025,220,30,30);
        h15.setBounds(535,220,30,30); h30.setBounds(1060,220,30,30);
        //octava fila
        f0.setBounds(10,255,30,30); //posiciones de las casillas y tamaño
        f1.setBounds(45,255,30,30); f16.setBounds(570,255,30,30); f31.setBounds(1095,255,30,30);
        f2.setBounds(80,255,30,30); f17.setBounds(605,255,30,30); f32.setBounds(1130,255,30,30);
        f3.setBounds(115,255,30,30); f18.setBounds(640,255,30,30); f33.setBounds(1165,255,30,30);
        f4.setBounds(150,255,30,30); f19.setBounds(675,255,30,30); f34.setBounds(1200,255,30,30);
        f5.setBounds(185,255,30,30); f20.setBounds(710,255,30,30); f35.setBounds(1235,255,30,30);
        f6.setBounds(220,255,30,30); f21.setBounds(745,255,30,30); f36.setBounds(1270,255,30,30);
        f7.setBounds(255,255,30,30); f22.setBounds(780,255,30,30); f37.setBounds(1305,255,30,30);
        f8.setBounds(290,255,30,30); f23.setBounds(815,255,30,30); f38.setBounds(1338,255,30,30);
        f9.setBounds(325,255,30,30); f24.setBounds(850,255,30,30); 
        f10.setBounds(360,255,30,30); f25.setBounds(885,255,30,30); 
        f11.setBounds(395,255,30,30); f26.setBounds(920,255,30,30);
        f12.setBounds(430,255,30,30); f27.setBounds(955,255,30,30);
        f13.setBounds(465,255,30,30); f28.setBounds(990,255,30,30);
        f14.setBounds(500,255,30,30); f29.setBounds(1025,255,30,30);
        f15.setBounds(535,255,30,30); f30.setBounds(1060,255,30,30);
        //novena fila
        i0.setBounds(10,290,30,30); //posiciones de las casillas y tamaño
        i1.setBounds(45,290,30,30); i16.setBounds(570,290,30,30); i31.setBounds(1095,290,30,30);
        i2.setBounds(80,290,30,30); i17.setBounds(605,290,30,30); i32.setBounds(1130,290,30,30);
        i3.setBounds(115,290,30,30); i18.setBounds(640,290,30,30); i33.setBounds(1165,290,30,30);
        i4.setBounds(150,290,30,30); i19.setBounds(675,290,30,30); i34.setBounds(1200,290,30,30);
        i5.setBounds(185,290,30,30); i20.setBounds(710,290,30,30); i35.setBounds(1235,290,30,30);
        i6.setBounds(220,290,30,30); i21.setBounds(745,290,30,30); i36.setBounds(1270,290,30,30);
        i7.setBounds(255,290,30,30); i22.setBounds(780,290,30,30); i37.setBounds(1305,290,30,30);
        i8.setBounds(290,290,30,30); i23.setBounds(815,290,30,30); i38.setBounds(1338,290,30,30);
        i9.setBounds(325,290,30,30); i24.setBounds(850,290,30,30); 
        i10.setBounds(360,290,30,30); i25.setBounds(885,290,30,30); 
        i11.setBounds(395,290,30,30); i26.setBounds(920,290,30,30);
        i12.setBounds(430,290,30,30); i27.setBounds(955,290,30,30);
        i13.setBounds(465,290,30,30); i28.setBounds(990,290,30,30);
        i14.setBounds(500,290,30,30); i29.setBounds(1025,290,30,30);
        i15.setBounds(535,290,30,30); i30.setBounds(1060,290,30,30);
        //decima fila
        j0.setBounds(10,325,30,30); //posiciones de las casillas y tamaño
        j1.setBounds(45,325,30,30); j16.setBounds(570,325,30,30); j31.setBounds(1095,325,30,30);
        j2.setBounds(80,325,30,30); j17.setBounds(605,325,30,30); j32.setBounds(1130,325,30,30);
        j3.setBounds(115,325,30,30); j18.setBounds(640,325,30,30); j33.setBounds(1165,325,30,30);
        j4.setBounds(150,325,30,30); j19.setBounds(675,325,30,30); j34.setBounds(1200,325,30,30);
        j5.setBounds(185,325,30,30); j20.setBounds(710,325,30,30); j35.setBounds(1235,325,30,30);
        j6.setBounds(220,325,30,30); j21.setBounds(745,325,30,30); j36.setBounds(1270,325,30,30);
        j7.setBounds(255,325,30,30); j22.setBounds(780,325,30,30); j37.setBounds(1305,325,30,30);
        j8.setBounds(290,325,30,30); j23.setBounds(815,325,30,30); j38.setBounds(1338,325,30,30);
        j9.setBounds(325,325,30,30); j24.setBounds(850,325,30,30); 
        j10.setBounds(360,325,30,30); j25.setBounds(885,325,30,30); 
        j11.setBounds(395,325,30,30); j26.setBounds(920,325,30,30);
        j12.setBounds(430,325,30,30); j27.setBounds(955,325,30,30);
        j13.setBounds(465,325,30,30); j28.setBounds(990,325,30,30);
        j14.setBounds(500,325,30,30); j29.setBounds(1025,325,30,30);
        j15.setBounds(535,325,30,30); j30.setBounds(1060,325,30,30);

        ventana.add(c0); //Se añaden las casillas a la ventana
        ventana.add(c1);  ventana.add(c16); ventana.add(c30);
        ventana.add(c3); ventana.add(c17); ventana.add(c31);
        ventana.add(c4); ventana.add(c18); ventana.add(c32);
        ventana.add(c5); ventana.add(c19);ventana.add(c33);
        ventana.add(c6); ventana.add(c20); ventana.add(c34);
        ventana.add(c7); ventana.add(c21);ventana.add(c35);
        ventana.add(c8); ventana.add(c22); ventana.add(c36);
        ventana.add(c9);ventana.add(c23); ventana.add(c37);
        ventana.add(c10); ventana.add(c24); ventana.add(c38);
        ventana.add(c11); ventana.add(c25); 
        ventana.add(c12); ventana.add(c26); 
        ventana.add(c13); ventana.add(c27); ventana.add(c2);
        ventana.add(c14); ventana.add(c28);
        ventana.add(c15); ventana.add(c29);
        //Segunda fila
        ventana.add(a0); //Se añaden las casillas a la ventana
        ventana.add(a1);  ventana.add(a16); ventana.add(a30);
        ventana.add(a3); ventana.add(a17); ventana.add(a31);
        ventana.add(a4); ventana.add(a18); ventana.add(a32);
        ventana.add(a5); ventana.add(a19);ventana.add(a33);
        ventana.add(a6); ventana.add(a20); ventana.add(a34);
        ventana.add(a7); ventana.add(a21);ventana.add(a35);
        ventana.add(a8); ventana.add(a22); ventana.add(a36);
        ventana.add(a9);ventana.add(a23); ventana.add(a37);
        ventana.add(a10); ventana.add(a24); ventana.add(a38);
        ventana.add(a11); ventana.add(a25); 
        ventana.add(a12); ventana.add(a26); 
        ventana.add(a13); ventana.add(a27); ventana.add(a2);
        ventana.add(a14); ventana.add(a28);
        ventana.add(a15); ventana.add(a29);
        //Tercera fila
        ventana.add(b0); //Se añaden las casillas a la ventana
        ventana.add(b1);  ventana.add(b16); ventana.add(b30);
        ventana.add(b3); ventana.add(b17); ventana.add(b31);
        ventana.add(b4); ventana.add(b18); ventana.add(b32);
        ventana.add(b5); ventana.add(b19);ventana.add(b33);
        ventana.add(b6); ventana.add(b20); ventana.add(b34);
        ventana.add(b7); ventana.add(b21);ventana.add(b35);
        ventana.add(b8); ventana.add(b22); ventana.add(b36);
        ventana.add(b9);ventana.add(b23); ventana.add(b37);
        ventana.add(b10); ventana.add(b24); ventana.add(b38);
        ventana.add(b11); ventana.add(b25); 
        ventana.add(b12); ventana.add(b26); 
        ventana.add(b13); ventana.add(b27); ventana.add(b2);
        ventana.add(b14); ventana.add(b28);
        ventana.add(b15); ventana.add(b29);
        //Cuarta fila
        ventana.add(d0); //Se añaden las casillas a la ventana
        ventana.add(d1);  ventana.add(d16); ventana.add(d30);
        ventana.add(d3); ventana.add(d17); ventana.add(d31);
        ventana.add(d4); ventana.add(d18); ventana.add(d32);
        ventana.add(d5); ventana.add(d19);ventana.add(d33);
        ventana.add(d6); ventana.add(d20); ventana.add(d34);
        ventana.add(d7); ventana.add(d21);ventana.add(d35);
        ventana.add(d8); ventana.add(d22); ventana.add(d36);
        ventana.add(d9);ventana.add(d23); ventana.add(d37);
        ventana.add(d10); ventana.add(d24); ventana.add(d38);
        ventana.add(d11); ventana.add(d25); 
        ventana.add(d12); ventana.add(d26); 
        ventana.add(d13); ventana.add(d27); ventana.add(d2);
        ventana.add(d14); ventana.add(d28);
        ventana.add(d15); ventana.add(d29);
        //Quinta fila
        ventana.add(e0); //Se añaden las casillas a la ventana
        ventana.add(e1);  ventana.add(e16); ventana.add(e30);
        ventana.add(e3); ventana.add(e17); ventana.add(e31);
        ventana.add(e4); ventana.add(e18); ventana.add(e32);
        ventana.add(e5); ventana.add(e19);ventana.add(e33);
        ventana.add(e6); ventana.add(e20); ventana.add(e34);
        ventana.add(e7); ventana.add(e21);ventana.add(e35);
        ventana.add(e8); ventana.add(e22); ventana.add(e36);
        ventana.add(e9);ventana.add(e23); ventana.add(e37);
        ventana.add(e10); ventana.add(e24); ventana.add(e38);
        ventana.add(e11); ventana.add(e25); 
        ventana.add(e12); ventana.add(e26); 
        ventana.add(e13); ventana.add(e27); ventana.add(e2);
        ventana.add(e14); ventana.add(e28);
        ventana.add(e15); ventana.add(e29);
        //sexta fila
        ventana.add(g0); //Se añaden las casillas a la ventana
        ventana.add(g1);  ventana.add(g16); ventana.add(g30);
        ventana.add(g3); ventana.add(g17); ventana.add(g31);
        ventana.add(g4); ventana.add(g18); ventana.add(g32);
        ventana.add(g5); ventana.add(g19);ventana.add(g33);
        ventana.add(g6); ventana.add(g20); ventana.add(g34);
        ventana.add(g7); ventana.add(g21);ventana.add(g35);
        ventana.add(g8); ventana.add(g22); ventana.add(g36);
        ventana.add(g9);ventana.add(g23); ventana.add(g37);
        ventana.add(g10); ventana.add(g24); ventana.add(g38);
        ventana.add(g11); ventana.add(g25); ventana.add(g14); ventana.add(g28);
        ventana.add(g12); ventana.add(g26); ventana.add(g14); ventana.add(g28);
        ventana.add(g13); ventana.add(g27); ventana.add(g2);
        //Setima fila
        ventana.add(h0); //Se añaden las casillas a la ventana
        ventana.add(h1);  ventana.add(h16); ventana.add(h30);
        ventana.add(h3); ventana.add(h17); ventana.add(h31);
        ventana.add(h4); ventana.add(h18); ventana.add(h32);
        ventana.add(h5); ventana.add(h19);ventana.add(h33);
        ventana.add(h6); ventana.add(h20); ventana.add(h34);
        ventana.add(h7); ventana.add(h21);ventana.add(h35);
        ventana.add(h8); ventana.add(h22); ventana.add(h36);
        ventana.add(h9);ventana.add(h23); ventana.add(h37);
        ventana.add(h10); ventana.add(h24); ventana.add(h38);
        ventana.add(h11); ventana.add(h25); ventana.add(h15); ventana.add(h29);
        ventana.add(h12); ventana.add(h26);ventana.add(h14); ventana.add(h28);
        ventana.add(h13); ventana.add(h27); ventana.add(h2);
        //octava fila
        ventana.add(f0); //Se añaden las casillas a la ventana
        ventana.add(f1);  ventana.add(f16); ventana.add(f30);
        ventana.add(f3); ventana.add(f17); ventana.add(f31);
        ventana.add(f4); ventana.add(f18); ventana.add(f32);
        ventana.add(f5); ventana.add(f19);ventana.add(f33);
        ventana.add(f6); ventana.add(f20); ventana.add(f34);
        ventana.add(f7); ventana.add(f21);ventana.add(f35);
        ventana.add(f8); ventana.add(f22); ventana.add(f36);
        ventana.add(f9);ventana.add(f23); ventana.add(f37);
        ventana.add(f10); ventana.add(f24); ventana.add(f38);
        ventana.add(f11); ventana.add(f25); ventana.add(f15); ventana.add(f29);
        ventana.add(f12); ventana.add(f26); ventana.add(f14); ventana.add(f28);
        ventana.add(f13); ventana.add(f27); ventana.add(f2);
        //novena fila
        ventana.add(i0); //Se añaden las casillas a la ventana
        ventana.add(i1);  ventana.add(i16); ventana.add(i30); ventana.add(i13); ventana.add(i27); ventana.add(i2);
        ventana.add(i3); ventana.add(i17); ventana.add(i31);
        ventana.add(i4); ventana.add(i18); ventana.add(i32);
        ventana.add(i5); ventana.add(i19);ventana.add(i33);
        ventana.add(i6); ventana.add(i20); ventana.add(i34);
        ventana.add(i7); ventana.add(i21);ventana.add(i35);
        ventana.add(i8); ventana.add(i22); ventana.add(i36);
        ventana.add(i9);ventana.add(i23); ventana.add(i37);
        ventana.add(i10); ventana.add(i24); ventana.add(i38);
        ventana.add(i11); ventana.add(i25);  ventana.add(i15); ventana.add(i29);
        ventana.add(i12); ventana.add(i26); ventana.add(i14); ventana.add(i28);
        //decimaa fila
        ventana.add(j0); //Se añaden las casillas a la ventana
        ventana.add(j1);  ventana.add(j16); ventana.add(j30);
        ventana.add(j3); ventana.add(j17); ventana.add(j31);
        ventana.add(j4); ventana.add(j18); ventana.add(j32);
        ventana.add(j5); ventana.add(j19);ventana.add(j33);
        ventana.add(j6); ventana.add(j20); ventana.add(j34);
        ventana.add(j7); ventana.add(j21);ventana.add(j35);
        ventana.add(j8); ventana.add(j22); ventana.add(j36);
        ventana.add(j9);ventana.add(j23); ventana.add(j37);
        ventana.add(j10); ventana.add(j24); ventana.add(j38);
        ventana.add(j11); ventana.add(j25); 
        ventana.add(j12); ventana.add(j26); 
        ventana.add(j13); ventana.add(j27); ventana.add(j2);
        ventana.add(j14); ventana.add(j28);
        ventana.add(j15); ventana.add(j29);
    } 
}