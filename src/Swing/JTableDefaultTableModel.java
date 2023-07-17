package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JTableDefaultTableModel extends JFrame{
    public static void main(String[] args) {
        JTableDefaultTableModel frame = new JTableDefaultTableModel();

        String columns[] = {"Manufacturer","Name","Year","Topspeed"};
        String data[][] = {
                {"Ford","t","1928","40"},
                {"Ford","Mustang","1978","200"}
        };

        DefaultTableModel model = new DefaultTableModel(data,columns);


        JTable jt = new JTable(model);
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(jt);
        pane.setPreferredSize(new Dimension(300,100));
        frame.add(pane, BorderLayout.CENTER);
        frame.pack();

        model.insertRow(1,new Object[]{"Dodge","Charger","1971","200"});
        model.insertRow(model.getRowCount(),new Object[]{"Dodge","Charger","1971","200"});

        ListSelectionModel listSelectionModel = jt.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return;

                ArrayList<String> arr = new ArrayList<>();
                
                int selectedRows[] = jt.getSelectedRows();
                int selectedColumns[] = jt.getSelectedColumns();
                
                for (int i=0; i<selectedRows.length;i++){
                    for (int j = 0; j < selectedColumns.length; j++) {
                        String selectedData = (String) jt.getValueAt(selectedRows[i],selectedColumns[j]);
                    arr.add(selectedData);
                    }
                }
                System.out.println("Selected "+arr);
            }
        });
        
        jt.setCellSelectionEnabled(true);
        jt.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        jt.setShowHorizontalLines(true);
        jt.setGridColor(Color.BLUE);
        

        jt.setValueAt("35",0,3);
        System.out.println(jt.getValueAt(1,1));
        System.out.println(jt.getColumnCount());
        System.out.println(jt.getColumnName(0));

        // frame.setLayout(new FlowLayout());
        //  frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
