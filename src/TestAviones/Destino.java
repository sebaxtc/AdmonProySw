package TestAviones;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Destino extends javax.swing.JFrame {
    
    static int opcion=0;
    TestAviones test = new TestAviones();
    static boolean evaluar,evalua; 
    
    public Destino() {
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        initComponents();
                     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        bt1 = new java.awt.Button();
        tx1 = new java.awt.TextField();
        tx2 = new java.awt.TextField();
        tx3 = new java.awt.TextField();
        jlb1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        bt3 = new java.awt.Button();
        bt4 = new java.awt.Button();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tx12 = new java.awt.TextField();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        bt6 = new java.awt.Button();
        bt5 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jp4 = new javax.swing.JPanel();
        tx4 = new java.awt.TextField();
        tx5 = new java.awt.TextField();
        tx6 = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt7 = new java.awt.Button();
        bt8 = new java.awt.Button();
        bt9 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jp5 = new javax.swing.JPanel();
        bt11 = new java.awt.Button();
        bt10 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxa1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jp6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tx7 = new java.awt.TextField();
        bt14 = new java.awt.Button();
        bt13 = new java.awt.Button();
        bt12 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jp7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tx8 = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        tx9 = new java.awt.TextField();
        bt15 = new java.awt.Button();
        bt16 = new java.awt.Button();
        bt17 = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jp8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tx10 = new java.awt.TextField();
        jLabel15 = new javax.swing.JLabel();
        tx11 = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        tx13 = new java.awt.TextField();
        bt18 = new java.awt.Button();
        jLabel17 = new javax.swing.JLabel();
        tx14 = new java.awt.TextField();
        bt19 = new java.awt.Button();
        bt20 = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();
        jp9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tx15 = new java.awt.TextField();
        jLabel20 = new javax.swing.JLabel();
        tx16 = new java.awt.TextField();
        jLabel21 = new javax.swing.JLabel();
        tx17 = new java.awt.TextField();
        jLabel22 = new javax.swing.JLabel();
        tx18 = new java.awt.TextField();
        bt21 = new java.awt.Button();
        bt22 = new java.awt.Button();
        bt23 = new java.awt.Button();
        jLabel18 = new javax.swing.JLabel();
        jp10 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        tx19 = new java.awt.TextField();
        bt24 = new java.awt.Button();
        bt25 = new java.awt.Button();
        jLabel24 = new javax.swing.JLabel();
        jp11 = new javax.swing.JPanel();
        bt28 = new java.awt.Button();
        bt29 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxa2 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jp12 = new javax.swing.JPanel();
        bt30 = new java.awt.Button();
        bt31 = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxa3 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jp13 = new javax.swing.JPanel();
        bt26 = new java.awt.Button();
        jLabel25 = new javax.swing.JLabel();
        jp14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        bt27 = new java.awt.Button();
        jp15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxa4 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jp16 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtxa5 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setName("fr1"); // NOI18N

        jp1.setBorder(new javax.swing.border.MatteBorder(null));
        jp1.setForeground(new java.awt.Color(255, 255, 255));
        jp1.setOpaque(false);
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("ENTRAR");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jp1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 160, 40));

        bt1.setBackground(new java.awt.Color(0, 0, 0));
        bt1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setLabel("SALIR");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jp1.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 40));

        tx1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tx1.setForeground(new java.awt.Color(0, 255, 255));
        jp1.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 40));

        tx2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tx2.setForeground(new java.awt.Color(0, 255, 255));
        jp1.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 40));

        tx3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tx3.setForeground(new java.awt.Color(0, 255, 255));
        jp1.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 170, 40));

        jlb1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Menu.PNG")); // NOI18N
        jp1.add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        jp2.setBorder(new javax.swing.border.MatteBorder(null));
        jp2.setForeground(new java.awt.Color(255, 255, 255));
        jp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jp2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jp2KeyTyped(evt);
            }
        });
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt3.setBackground(new java.awt.Color(0, 0, 0));
        bt3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 255, 255));
        bt3.setLabel("SALIR");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jp2.add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        bt4.setBackground(new java.awt.Color(0, 0, 0));
        bt4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 255, 255));
        bt4.setLabel("SIGUIENTE");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jp2.add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });
        jp2.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 110, 70));

        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });
        jp2.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 130, 90));

        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });
        jp2.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 130, 70));

        tx12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tx12.setForeground(new java.awt.Color(0, 0, 204));
        tx12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx12ActionPerformed(evt);
            }
        });
        tx12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx12KeyPressed(evt);
            }
        });
        jp2.add(tx12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 60, 40));

        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 153));
        label1.setText("OPCION:");
        jp2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Interfaz.PNG")); // NOI18N
        jp2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 610));

        jp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt6.setBackground(new java.awt.Color(0, 0, 0));
        bt6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 255, 255));
        bt6.setLabel("SALIR");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jp3.add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 80, 40));

        bt5.setBackground(new java.awt.Color(0, 0, 0));
        bt5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 255, 255));
        bt5.setLabel("ANTERIOR");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jp3.add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Intrfaz2da.PNG")); // NOI18N
        jp3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tx4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp4.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 210, 40));

        tx5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp4.add(tx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 210, 40));

        tx6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp4.add(tx6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 210, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE DEL AVION:");
        jp4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 200, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("CAPACIDAD DEL AVION:");
        jp4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 240, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("AVIONES EN SERVICIO:");
        jp4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 220, 40));

        bt7.setBackground(new java.awt.Color(0, 0, 0));
        bt7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 255, 255));
        bt7.setLabel("CAPTURAR DATOS");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jp4.add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 190, 40));

        bt8.setBackground(new java.awt.Color(0, 0, 0));
        bt8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 255, 255));
        bt8.setLabel("SALIR");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jp4.add(bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        bt9.setBackground(new java.awt.Color(0, 0, 0));
        bt9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt9.setForeground(new java.awt.Color(255, 255, 255));
        bt9.setLabel("MENU");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jp4.add(bt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Inser. Avion..PNG")); // NOI18N
        jp4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt11.setBackground(new java.awt.Color(0, 0, 0));
        bt11.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt11.setForeground(new java.awt.Color(255, 255, 255));
        bt11.setLabel("MENU");
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });
        jp5.add(bt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        bt10.setBackground(new java.awt.Color(0, 0, 0));
        bt10.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt10.setForeground(new java.awt.Color(255, 255, 255));
        bt10.setLabel("SALIR");
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });
        jp5.add(bt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        jtxa1.setEditable(false);
        jtxa1.setColumns(20);
        jtxa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxa1.setLineWrap(true);
        jtxa1.setRows(5);
        jtxa1.setToolTipText("");
        jScrollPane1.setViewportView(jtxa1);

        jp5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 320));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Listar.PNG")); // NOI18N
        jLabel8.setOpaque(true);
        jp5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("DAME EL NOMBRE DEL AVION:");
        jp6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 310, 40));

        tx7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp6.add(tx7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 230, 50));

        bt14.setBackground(new java.awt.Color(0, 0, 0));
        bt14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt14.setForeground(new java.awt.Color(255, 255, 255));
        bt14.setLabel("BUSCAR");
        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });
        jp6.add(bt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 110, 40));

        bt13.setBackground(new java.awt.Color(0, 0, 0));
        bt13.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt13.setForeground(new java.awt.Color(255, 255, 255));
        bt13.setLabel("MENU");
        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });
        jp6.add(bt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 110, 40));

        bt12.setBackground(new java.awt.Color(0, 0, 0));
        bt12.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt12.setForeground(new java.awt.Color(255, 255, 255));
        bt12.setLabel("SALIR");
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });
        jp6.add(bt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 80, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Borrar.PNG")); // NOI18N
        jp6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        jp7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel11.setText("DAME EL NOMBRE DEL AVION:");
        jp7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 310, 40));

        tx8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp7.add(tx8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 230, 50));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel12.setText("CUANTOS AVIONES POSEE LA AEROLINEA:");
        jp7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 420, 40));

        tx9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp7.add(tx9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 230, 50));

        bt15.setBackground(new java.awt.Color(0, 0, 0));
        bt15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt15.setForeground(new java.awt.Color(255, 255, 255));
        bt15.setLabel("ACTUALIZAR");
        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });
        jp7.add(bt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 230, 40));

        bt16.setBackground(new java.awt.Color(0, 0, 0));
        bt16.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt16.setForeground(new java.awt.Color(255, 255, 255));
        bt16.setLabel("MENU");
        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });
        jp7.add(bt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        bt17.setBackground(new java.awt.Color(0, 0, 0));
        bt17.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt17.setForeground(new java.awt.Color(255, 255, 255));
        bt17.setLabel("SALIR");
        bt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt17ActionPerformed(evt);
            }
        });
        jp7.add(bt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Num. Avion. Serv..PNG")); // NOI18N
        jp7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("NUMERO DE TRIMESTRE:");
        jp8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, 50));

        tx10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tx10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx10ActionPerformed(evt);
            }
        });
        jp8.add(tx10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 210, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("DESTINO:");
        jp8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, 40));

        tx11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp8.add(tx11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 210, 40));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("DISTANCIA DE MEXICO AL DESTIINO:");
        jp8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 340, 40));

        tx13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp8.add(tx13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 210, 40));

        bt18.setBackground(new java.awt.Color(0, 0, 0));
        bt18.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt18.setForeground(new java.awt.Color(255, 255, 255));
        bt18.setLabel("CAPTURAR DATOS");
        bt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt18ActionPerformed(evt);
            }
        });
        jp8.add(bt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 190, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("NUMERO DE PASAJEROS:");
        jp8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 240, 50));

        tx14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp8.add(tx14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 210, 40));

        bt19.setBackground(new java.awt.Color(0, 0, 0));
        bt19.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt19.setForeground(new java.awt.Color(255, 255, 255));
        bt19.setLabel("MENU");
        bt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt19ActionPerformed(evt);
            }
        });
        jp8.add(bt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        bt20.setBackground(new java.awt.Color(0, 0, 0));
        bt20.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt20.setForeground(new java.awt.Color(255, 255, 255));
        bt20.setLabel("SALIR");
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });
        jp8.add(bt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Trim. Nac..PNG")); // NOI18N
        jp8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("NUMERO DE TRIMESTRE:");
        jp9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, 50));

        tx15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tx15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx15ActionPerformed(evt);
            }
        });
        jp9.add(tx15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 210, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setText("DESTINO:");
        jp9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, 40));

        tx16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp9.add(tx16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 210, 40));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setText("DISTANCIA DE MEXICO AL DESTIINO:");
        jp9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 340, 40));

        tx17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp9.add(tx17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 210, 40));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setText("NUMERO DE PASAJEROS:");
        jp9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 240, 50));

        tx18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jp9.add(tx18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 210, 40));

        bt21.setBackground(new java.awt.Color(0, 0, 0));
        bt21.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt21.setForeground(new java.awt.Color(255, 255, 255));
        bt21.setLabel("CAPTURAR DATOS");
        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });
        jp9.add(bt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 190, 40));

        bt22.setBackground(new java.awt.Color(0, 0, 0));
        bt22.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt22.setForeground(new java.awt.Color(255, 255, 255));
        bt22.setLabel("MENU");
        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });
        jp9.add(bt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        bt23.setBackground(new java.awt.Color(0, 0, 0));
        bt23.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt23.setForeground(new java.awt.Color(255, 255, 255));
        bt23.setLabel("SALIR");
        bt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt23ActionPerformed(evt);
            }
        });
        jp9.add(bt23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Trim. Inter..PNG")); // NOI18N
        jp9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        jp10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 153));
        label2.setText("OPCION:");
        jp10.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 110, 40));

        tx19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tx19.setForeground(new java.awt.Color(0, 0, 204));
        tx19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx19ActionPerformed(evt);
            }
        });
        tx19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx19KeyPressed(evt);
            }
        });
        jp10.add(tx19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 60, 40));

        bt24.setBackground(new java.awt.Color(0, 0, 0));
        bt24.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt24.setForeground(new java.awt.Color(255, 255, 255));
        bt24.setLabel("SALIR");
        bt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt24ActionPerformed(evt);
            }
        });
        jp10.add(bt24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 80, 40));

        bt25.setBackground(new java.awt.Color(0, 0, 0));
        bt25.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt25.setForeground(new java.awt.Color(255, 255, 255));
        bt25.setLabel("MENU");
        bt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt25ActionPerformed(evt);
            }
        });
        jp10.add(bt25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\Opciones. Bus. Dest.png")); // NOI18N
        jp10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));

        jp11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt28.setBackground(new java.awt.Color(0, 0, 0));
        bt28.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt28.setForeground(new java.awt.Color(255, 255, 255));
        bt28.setLabel("MENU");
        bt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt28ActionPerformed(evt);
            }
        });
        jp11.add(bt28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 110, 40));

        bt29.setBackground(new java.awt.Color(0, 0, 0));
        bt29.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt29.setForeground(new java.awt.Color(255, 255, 255));
        bt29.setLabel("SALIR");
        bt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt29ActionPerformed(evt);
            }
        });
        jp11.add(bt29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 80, 40));

        jScrollPane2.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane2.setOpaque(false);

        jtxa2.setEditable(false);
        jtxa2.setColumns(20);
        jtxa2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxa2.setLineWrap(true);
        jtxa2.setRows(5);
        jtxa2.setToolTipText("");
        jScrollPane2.setViewportView(jtxa2);

        jp11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 320));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\List. Dest..PNG")); // NOI18N
        jp11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));

        jp12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt30.setBackground(new java.awt.Color(0, 0, 0));
        bt30.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt30.setForeground(new java.awt.Color(255, 255, 255));
        bt30.setLabel("MENU");
        bt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt30ActionPerformed(evt);
            }
        });
        jp12.add(bt30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 110, 40));

        bt31.setBackground(new java.awt.Color(0, 0, 0));
        bt31.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt31.setForeground(new java.awt.Color(255, 255, 255));
        bt31.setLabel("SALIR");
        bt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt31ActionPerformed(evt);
            }
        });
        jp12.add(bt31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, 40));

        jScrollPane3.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane3.setOpaque(false);

        jtxa3.setEditable(false);
        jtxa3.setColumns(20);
        jtxa3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxa3.setLineWrap(true);
        jtxa3.setRows(5);
        jtxa3.setToolTipText("");
        jScrollPane3.setViewportView(jtxa3);

        jp12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 320));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\List. Dest..PNG")); // NOI18N
        jp12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));

        jp13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt26.setBackground(new java.awt.Color(0, 0, 0));
        bt26.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt26.setForeground(new java.awt.Color(255, 255, 255));
        bt26.setLabel("MOSTRAR ESTADISTICAS");
        bt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt26ActionPerformed(evt);
            }
        });
        jp13.add(bt26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 220, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\DemandasNacionales.PNG")); // NOI18N
        jp13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        jp14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\DemandasInternacionales.PNG")); // NOI18N
        jp14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        bt27.setBackground(new java.awt.Color(0, 0, 0));
        bt27.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt27.setForeground(new java.awt.Color(255, 255, 255));
        bt27.setLabel("MOSTRAR ESTADISTICAS");
        bt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt27ActionPerformed(evt);
            }
        });
        jp14.add(bt27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 220, 40));

        jp15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane4.setOpaque(false);

        jtxa4.setEditable(false);
        jtxa4.setColumns(20);
        jtxa4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxa4.setLineWrap(true);
        jtxa4.setRows(5);
        jtxa4.setToolTipText("");
        jScrollPane4.setViewportView(jtxa4);

        jp15.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 320));

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\EstadisticasNac.PNG")); // NOI18N
        jp15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        jp16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane5.setOpaque(false);

        jtxa5.setEditable(false);
        jtxa5.setColumns(20);
        jtxa5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxa5.setLineWrap(true);
        jtxa5.setRows(5);
        jtxa5.setToolTipText("");
        jScrollPane5.setViewportView(jtxa5);

        jp16.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 320));

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Documents\\NetBeansProjects\\AdminProy\\src\\TestAviones\\EstadisticasInternacionales.PNG")); // NOI18N
        jp16.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("fr1");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
      
        if(("".compareTo(tx1.getText()) == 0) && ("".compareTo(tx2.getText()) == 0))
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio", "AVISO",JOptionPane.ERROR_MESSAGE);
        else{
            if((isNumeric(tx1.getText())) &&  (isNumeric(tx2.getText())) && ("Air".equals(tx3.getText()))){
                jp1.setVisible(false);
                jp2.setVisible(true);
                JOptionPane.showMessageDialog(null,"Presiona enter cuando captures la opcion", "AVISO",JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,"Algun campo es erroneo", "AVISO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        jp2.setVisible(false);
        jp3.setVisible(true);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        jp2.setVisible(true);
        jp3.setVisible(false);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt6ActionPerformed

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked

    }//GEN-LAST:event_lb1MouseClicked

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if(("".compareTo(tx4.getText()) == 0) || ("".compareTo(tx5.getText()) == 0) || ("".compareTo(tx6.getText()) == 0))
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "AVISO",JOptionPane.PLAIN_MESSAGE);
        else{
            if((isNumeric(tx5.getText())) && (isNumeric(tx6.getText()))){
                evaluar = test.Inserta();
                if(evaluar == true ){
                JOptionPane.showMessageDialog(null,"Datos Capturados", "AVISO",JOptionPane.PLAIN_MESSAGE);
                tx4.setText("");
                tx5.setText("");
                tx6.setText("");
                                    }
                else
                JOptionPane.showMessageDialog(null,"No hay espacio en el arreglo", "AVISO",JOptionPane.PLAIN_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,"Los datos deben ser numericos", "AVISO",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        jp2.setVisible(true);
        jp4.setVisible(false);       
    }//GEN-LAST:event_bt9ActionPerformed

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
      
    }//GEN-LAST:event_lb2MouseClicked

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        System.exit(0);  
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        jp2.setVisible(true);
        jp4.setVisible(false); 
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        int r;
        
        r = test.Borrar();
        if(r == 0)
            JOptionPane.showMessageDialog(null,"No existe el avion", "AVISO",JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Dato Borrado", "AVISO",JOptionPane.PLAIN_MESSAGE);
        
        tx7.setText("");
    }//GEN-LAST:event_bt14ActionPerformed

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked

    }//GEN-LAST:event_lb3MouseClicked

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        jp2.setVisible(true);
        jp6.setVisible(false);       
    }//GEN-LAST:event_bt13ActionPerformed

    private void jp2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jp2KeyPressed
                      
    }//GEN-LAST:event_jp2KeyPressed

    private void jp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jp2KeyTyped

    }//GEN-LAST:event_jp2KeyTyped

    private void tx12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx12KeyPressed
         int key=evt.getKeyCode();
         if(key == KeyEvent.VK_ENTER){
             if((isNumeric(tx12.getText()))){
                switch (Integer.parseInt(tx12.getText())) {
                
                case 1:
                        tx12.setText("");
                        OcultaPanel();
                        jp4.setVisible(true);
                break;
                    
                    
                    
                    
                case 2:
                        tx12.setText("");
                        OcultaPanel();
                        test.Imprime();
                        jp5.setVisible(true);   
                break;

                    
                    
                    
                case 3:
                        tx12.setText("");
                        OcultaPanel();
                        jp6.setVisible(true);
                break;
                
                    
                    
                    
                    
                case 4:
                        tx12.setText("");
                        OcultaPanel();
                break;
                   
                    
                    
                    
                case 5:
                        tx12.setText("");
                        OcultaPanel();
                break;
               
                    
                    
                case 6:
                        tx12.setText("");
                        OcultaPanel();    
                break;
               
                      
                    
                    
                case 7:
                        tx12.setText("");
                        OcultaPanel();
                break;
                      
                
                
                case 8:
                        tx12.setText("");
                        OcultaPanel();
                break;
                    
                    
                    
                   
                case 9:
                       tx12.setText("");
                       OcultaPanel();
                break;
                    
                    
                    
                    
                case 10:
                       tx12.setText("");
                       OcultaPanel();
                break;
                    
                default:
                        JOptionPane.showMessageDialog(null,"Esa opcion no existe", "AVISO",JOptionPane.PLAIN_MESSAGE);
                break;
                                                           }
                                            }
             else
             JOptionPane.showMessageDialog(null,"Solo se permiten numeros del 1 al 10", "AVISO",JOptionPane.PLAIN_MESSAGE);
                                     }
         
    }//GEN-LAST:event_tx12KeyPressed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        int d;
        d = test.BuscaDato();
        if(d == 1)
            JOptionPane.showMessageDialog(null,"El dato se ha actualizado", "AVISO",JOptionPane.PLAIN_MESSAGE);
        else
           JOptionPane.showMessageDialog(null,"No existe el avion o algun valor es erroneo", "AVISO",JOptionPane.PLAIN_MESSAGE); 
        
        tx8.setText("");
        tx9.setText("");
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt17ActionPerformed

    private void bt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt18ActionPerformed
    if(("".compareTo(tx10.getText()) == 0) || ("".compareTo(tx11.getText()) == 0) || ("".compareTo(tx13.getText()) == 0) || ("".compareTo(tx14.getText()) == 0))
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "AVISO",JOptionPane.PLAIN_MESSAGE);
    else{
         if((isNumeric(tx10.getText())) && (isNumeric(tx13.getText())) && (isNumeric(tx14.getText()))){
                if(Integer.parseInt(tx10.getText()) >=1 && Integer.parseInt(tx10.getText()) <=4){
                        evalua = test.Insertar();
                        if(evalua == true){
                        JOptionPane.showMessageDialog(null,"Datos Capturados", "AVISO",JOptionPane.PLAIN_MESSAGE);
                        tx10.setText("");
                        tx11.setText("");
                        tx13.setText("");
                        tx14.setText("");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"No hay espacio en el arreglo", "AVISO",JOptionPane.PLAIN_MESSAGE);                                                               }
                else
                    JOptionPane.showMessageDialog(null,"Los trimestres unicamente son 4", "AVISO",JOptionPane.PLAIN_MESSAGE);
                                                                                                      }
         else
            JOptionPane.showMessageDialog(null,"Hay algunos campos que no contienen valores numericos", "AVISO",JOptionPane.PLAIN_MESSAGE);                                                                                              
        }   
    }//GEN-LAST:event_bt18ActionPerformed

    private void bt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt19ActionPerformed
        jp8.setVisible(false);     
        jp2.setVisible(true);
    }//GEN-LAST:event_bt19ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt20ActionPerformed

    private void tx10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx10ActionPerformed

    }//GEN-LAST:event_tx10ActionPerformed

    private void tx15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx15ActionPerformed
   
    }//GEN-LAST:event_tx15ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
    if(("".compareTo(tx15.getText()) == 0) || ("".compareTo(tx16.getText()) == 0) || ("".compareTo(tx17.getText()) == 0) || ("".compareTo(tx18.getText()) == 0))
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "AVISO",JOptionPane.PLAIN_MESSAGE);
    else{
         if((isNumeric(tx15.getText())) && (isNumeric(tx17.getText())) && (isNumeric(tx18.getText()))){
                if(Integer.parseInt(tx15.getText()) >=1 && Integer.parseInt(tx15.getText()) <=4){
                        evalua = test.InsertaInter();
                        if(evalua == true){
                        JOptionPane.showMessageDialog(null,"Datos Capturados", "AVISO",JOptionPane.PLAIN_MESSAGE);
                        tx15.setText("");
                        tx16.setText("");
                        tx17.setText("");
                        tx18.setText("");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"No hay espacio en el arreglo", "AVISO",JOptionPane.PLAIN_MESSAGE);                                                               }
                else
                    JOptionPane.showMessageDialog(null,"Los trimestres unicamente son 4", "AVISO",JOptionPane.PLAIN_MESSAGE);
                                                                                                      }
         else
            JOptionPane.showMessageDialog(null,"Hay algunos campos que no contienen valores numericos", "AVISO",JOptionPane.PLAIN_MESSAGE);                                                                                              
        }    
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        jp9.setVisible(false);     
        jp2.setVisible(true);
    }//GEN-LAST:event_bt22ActionPerformed

    private void bt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt23ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt23ActionPerformed

    private void tx19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx19KeyPressed
     int key=evt.getKeyCode();
         if(key == KeyEvent.VK_ENTER){
            if((isNumeric(tx19.getText()))){
                switch (Integer.parseInt(tx19.getText())) {
                
                case 1:
                        tx19.setText("");
                        OcultaPanel();
                        test.ImprimeNacional();
                        jp11.setVisible(true);
                break;
                    
                    
                    
                    
                case 2:
                        tx19.setText("");
                        OcultaPanel();
                        test.ImprimeInternacional();
                        jp12.setVisible(true);   
                break;
                    
                default:
                        JOptionPane.showMessageDialog(null,"Esa opcion no existe", "AVISO",JOptionPane.PLAIN_MESSAGE);
                break;
                }
            }             
         }
    }//GEN-LAST:event_tx19KeyPressed

    private void tx19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx19ActionPerformed

    }//GEN-LAST:event_tx19ActionPerformed

    private void tx12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx12ActionPerformed

    }//GEN-LAST:event_tx12ActionPerformed

    private void bt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt24ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bt24ActionPerformed

    private void bt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt25ActionPerformed
         jp10.setVisible(false);     
         jp2.setVisible(true);
    }//GEN-LAST:event_bt25ActionPerformed

    private void bt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt28ActionPerformed
         jp11.setVisible(false);     
         jp2.setVisible(true);        
    }//GEN-LAST:event_bt28ActionPerformed

    private void bt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt29ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt29ActionPerformed

    private void bt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt30ActionPerformed
        jp12.setVisible(false);     
        jp2.setVisible(true);       
    }//GEN-LAST:event_bt30ActionPerformed

    private void bt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt31ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bt31ActionPerformed

    private void bt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt26ActionPerformed
         OcultaPanel();
         jp15.setVisible(true);
         test.MostrarEstadisticasNacionales();
    }//GEN-LAST:event_bt26ActionPerformed

    private void bt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt27ActionPerformed
        
    
    
 
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }    
    
    
    private static  void OcultaPanel(){
    jp1.setVisible(false);
    jp2.setVisible(false);
    jp3.setVisible(false);
    jp4.setVisible(false);
    jp5.setVisible(false);    
    jp6.setVisible(false);
    }
    
    
    
    public static int CapturarMax(){
    int max=0;
        if(isNumeric(tx1.getText()) && (!("".equals(tx1.getText())) || (!("".equals(tx2.getText()))))) {  
            max = Integer.parseInt(tx1.getText());
        }  
    return max;
    }
    

    public static int CapturarMin(){
    int min=0;
        if(isNumeric(tx2.getText()) && (!("".equals(tx1.getText())) || (!("".equals(tx2.getText())))))
        min = Integer.parseInt(tx2.getText());  
    return min;
    }
    
    public static int GetOpcion(){   
    return opcion;
    }
    
    public static String CapturarNombre(){
    String nombre="";
   
        if((!("".equals(tx5.getText())) && (!("".equals(tx6.getText())))))
        nombre = tx4.getText(); 
    return nombre;
    }
    
    public static int CapturarCapacidad(){
    int capacidad=0;
        if(isNumeric(tx5.getText()) && (!("".equals(tx6.getText())) || (!("".equals(tx4.getText()))))) {  
            capacidad = Integer.parseInt(tx5.getText());
        }  
    return capacidad;
    }
    
    
    public static int CapturarServicio(){
    int servicio=0;
        if(isNumeric(tx6.getText()) && (!("".equals(tx5.getText())) || (!("".equals(tx4.getText()))))) {  
            servicio = Integer.parseInt(tx6.getText());
        }  
    return servicio;
    }
    
  
    
//DATOS PARA TRIMESTRE NACIONAL
    public static int CapturaNumTrimestre(){
    int numero=0;    
        if(Integer.parseInt(tx10.getText()) >=1 && Integer.parseInt(tx10.getText()) <=4 && isNumeric(tx10.getText()))
        numero = Integer.parseInt(tx10.getText());
    return numero;
    }
    
    public static String CapturaDestino(){
    String destino = "";    
        if(!("".equals(tx11.getText())))
        destino = tx11.getText();
    return destino;
    }    
    
    public static int CapturaDistancia(){
    int distancia = 0;    
        if(isNumeric(tx13.getText()))
        distancia = Integer.parseInt(tx13.getText());
    return distancia;
    } 
    
    
    public static int CapturaPasajeros(){
    int pasajero = 0;    
        if(isNumeric(tx14.getText()))
        pasajero = Integer.parseInt(tx14.getText());
    return pasajero;
    } 

       
//DATOS PARA TRIMESTRE NACIONAL
   public static int CapturaNumTrimestreInter(){
    int numero=0;    
        if(Integer.parseInt(tx15.getText()) >=1 && Integer.parseInt(tx15.getText()) <=4 && isNumeric(tx15.getText()))
        numero = Integer.parseInt(tx15.getText());
    return numero;
    }
    
    public static String CapturaDestinoInter(){
    String destino = "";    
        if(!("".equals(tx16.getText())))
        destino = tx16.getText();
    return destino;
    }    
    
    public static int CapturaDistanciaInter(){
    int distancia = 0;    
        if(isNumeric(tx17.getText()))
        distancia = Integer.parseInt(tx17.getText());
    return distancia;
    } 
    
    
    public static int CapturaPasajerosInter(){
    int pasajero = 0;    
        if(isNumeric(tx18.getText()))
        pasajero = Integer.parseInt(tx18.getText());
    return pasajero;
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Button bt1;
    public static java.awt.Button bt10;
    public static java.awt.Button bt11;
    public static java.awt.Button bt12;
    public static java.awt.Button bt13;
    public static java.awt.Button bt14;
    public static java.awt.Button bt15;
    public static java.awt.Button bt16;
    public static java.awt.Button bt17;
    public static java.awt.Button bt18;
    public static java.awt.Button bt19;
    public static java.awt.Button bt20;
    public static java.awt.Button bt21;
    public static java.awt.Button bt22;
    public static java.awt.Button bt23;
    public static java.awt.Button bt24;
    public static java.awt.Button bt25;
    public static java.awt.Button bt26;
    public static java.awt.Button bt27;
    public static java.awt.Button bt28;
    public static java.awt.Button bt29;
    public static java.awt.Button bt3;
    public static java.awt.Button bt30;
    public static java.awt.Button bt31;
    public static java.awt.Button bt4;
    public static java.awt.Button bt5;
    public static java.awt.Button bt6;
    public static java.awt.Button bt7;
    public static java.awt.Button bt8;
    public static java.awt.Button bt9;
    public static java.awt.Button button1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel jlb1;
    public static javax.swing.JPanel jp1;
    public static javax.swing.JPanel jp10;
    public static javax.swing.JPanel jp11;
    public static javax.swing.JPanel jp12;
    private javax.swing.JPanel jp13;
    public static javax.swing.JPanel jp14;
    public static javax.swing.JPanel jp15;
    public static javax.swing.JPanel jp16;
    public static javax.swing.JPanel jp2;
    public static javax.swing.JPanel jp3;
    public static javax.swing.JPanel jp4;
    public static javax.swing.JPanel jp5;
    public static javax.swing.JPanel jp6;
    public static javax.swing.JPanel jp7;
    public static javax.swing.JPanel jp8;
    public static javax.swing.JPanel jp9;
    public static javax.swing.JTextArea jtxa1;
    public static javax.swing.JTextArea jtxa2;
    public static javax.swing.JTextArea jtxa3;
    public static javax.swing.JTextArea jtxa4;
    public static javax.swing.JTextArea jtxa5;
    public static java.awt.Label label1;
    public static java.awt.Label label2;
    public static javax.swing.JLabel lb1;
    public static javax.swing.JLabel lb2;
    public static javax.swing.JLabel lb3;
    public static java.awt.TextField tx1;
    public static java.awt.TextField tx10;
    public static java.awt.TextField tx11;
    public static java.awt.TextField tx12;
    public static java.awt.TextField tx13;
    public static java.awt.TextField tx14;
    public static java.awt.TextField tx15;
    public static java.awt.TextField tx16;
    public static java.awt.TextField tx17;
    public static java.awt.TextField tx18;
    public static java.awt.TextField tx19;
    public static java.awt.TextField tx2;
    public static java.awt.TextField tx3;
    public static java.awt.TextField tx4;
    public static java.awt.TextField tx5;
    public static java.awt.TextField tx6;
    public static java.awt.TextField tx7;
    public static java.awt.TextField tx8;
    public static java.awt.TextField tx9;
    // End of variables declaration//GEN-END:variables
}
