
package ticket;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.management.Query.value;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

class ButtonEditor extends DefaultCellEditor {
   JButton button;

   String label;

   boolean isPushed;

  public ButtonEditor(JCheckBox checkBox) {
    super(checkBox);
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
      }
    });
  }

  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else {
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    label = (value == null) ? "MORE INFO" : value.toString();
    button.setText(label);  
    isPushed = true;
    return button;
  }
  
  

  public Object getCellEditorValue() {
    if (isPushed) {
        
        /*if button is pushed open next panel*/
        
        matchesMoreInfoPanel matchesmoreinfo = new matchesMoreInfoPanel();
        matchesmoreinfo.setVisible(true);
        matchesmoreinfo.pack();
        matchesmoreinfo.setLocationRelativeTo(null);
        
    }
    isPushed = false;
    return new String(label);
  }

  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }

  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
}


