import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class INGNepal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	FullTimeStaffHire fullTimeHire;
	PartTimeStaffHire partTimeHire;
	private ArrayList<StaffHire> arrList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INGNepal window = new INGNepal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public INGNepal() {
		initialize();
	}

	public void one() {
		JLabel lblFullTimeStaffhire = new JLabel("Full Time StaffHire");
		lblFullTimeStaffhire.setBounds(300, 12, 129, 15);
		frame.getContentPane().add(lblFullTimeStaffhire);

		JLabel lblVacancyNumber = new JLabel("Vacancy Number :");
		lblVacancyNumber.setBounds(39, 79, 141, 24);
		frame.getContentPane().add(lblVacancyNumber);

		textField = new JTextField();
		textField.setBounds(175, 82, 141, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblJobTye = new JLabel("Job Type :");
		lblJobTye.setBounds(39, 144, 70, 15);
		frame.getContentPane().add(lblJobTye);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 142, 141, 19);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setBounds(39, 197, 109, 15);
		frame.getContentPane().add(lblDesignation);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 195, 141, 19);
		frame.getContentPane().add(textField_2);
		
		JLabel lblWorkingHours = new JLabel("Working Hours :");
		lblWorkingHours.setBounds(39, 250, 129, 15);
		frame.getContentPane().add(lblWorkingHours);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 248, 141, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setBounds(39, 298, 70, 15);
		frame.getContentPane().add(lblSalary);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(175, 296, 141, 19);
		frame.getContentPane().add(textField_4);
		
		JButton btnAdd = new JButton("Add"); //up add
		btnAdd.setBounds(39, 349, 277, 25);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg) {
                int vacancy = 0,workingHour = 0,income = 0;
                String vacNo = textField.getText();
                String staffName = textField_5.getText();
                String designation = textField_2.getText();
                String jobType = textField_1.getText();
                String salary = textField_4.getText();
                String joinedDate = textField_6.getText();
                String workHours = textField_3.getText();
                String appointedBy = textField_9.getText();
                String qualification = textField_8.getText();

                if(vacNo.trim().equals("")||staffName.trim().equals("")||designation.trim().equals("")||jobType.trim().equals("")||salary.trim().equals("")||joinedDate.trim().equals("")||workHours.trim().equals("")||appointedBy.trim().equals("")||qualification.trim().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                }else {
                    try {
                        vacancy = Integer.parseInt(vacNo);
                        workingHour = Integer.parseInt(workHours);
                        income = Integer.parseInt(salary);
                    }catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                        return;
                    }
                    for(StaffHire s : arrList) {
                        if(s instanceof FullTimeStaffHire) {
                            FullTimeStaffHire full = (FullTimeStaffHire) s;
                            if(full.getVacancyNumber() == vacancy) {
                                JOptionPane.showMessageDialog(frame,"staff already hired");
                            }
                        }
                    }
                }
                fullTimeHire = new FullTimeStaffHire(vacancy, designation, jobType, income, workingHour);
                arrList.add(fullTimeHire);
            }
        });
		
		JLabel lblStaffName = new JLabel("Staff Name :");
		lblStaffName.setBounds(436, 84, 96, 15);
		frame.getContentPane().add(lblStaffName);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(578, 82, 141, 19);
		frame.getContentPane().add(textField_5);
		
		JLabel lblJoiningDate = new JLabel("Joining Date :");
		lblJoiningDate.setBounds(436, 144, 96, 15);
		frame.getContentPane().add(lblJoiningDate);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(578, 142, 141, 19);
		frame.getContentPane().add(textField_6);
		
		JLabel lblQualification = new JLabel("Qualification :");
		lblQualification.setBounds(436, 250, 109, 15);
		frame.getContentPane().add(lblQualification);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(578, 248, 141, 19);
		frame.getContentPane().add(textField_8);
		
		JLabel lblAppointedBy = new JLabel("Appointed By :");
		lblAppointedBy.setBounds(436, 298, 129, 15);
		frame.getContentPane().add(lblAppointedBy);		
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(578, 296, 141, 19);
		frame.getContentPane().add(textField_9);
		
		JButton btnAppoint = new JButton("Appoint"); //up appoint
		btnAppoint.setBounds(436, 349, 283, 25);
		frame.getContentPane().add(btnAppoint);
		btnAppoint.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg) {
                int vacancy = 0;
                String vacNo = textField.getText();
                String staffName = textField_5.getText();
                String designation = textField_2.getText();
                String jobType = textField_1.getText();
                String salary = textField_4.getText();
                String joinedDate = textField_6.getText();
                String workHours = textField_3.getText();
                String appointedBy = textField_9.getText();
                String qualification = textField_8.getText();

                if(vacNo.trim().equals("")||staffName.trim().equals("")||designation.trim().equals("")||jobType.trim().equals("")||salary.trim().equals("")||joinedDate.trim().equals("")||workHours.trim().equals("")||appointedBy.trim().equals("")||qualification.trim().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                }else {
                    try {
                        vacancy = Integer.parseInt(vacNo);
                    }catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                        return;
                    }
                }
                for(int i=0;i<arrList.size();i++) {
                    StaffHire s = arrList.get(i);
                    if(s instanceof FullTimeStaffHire) {
                        FullTimeStaffHire full = (FullTimeStaffHire)s;
                        if(full.getVacancyNumber()==vacancy) {
                            full.hireFullTimeStaff(staffName, joinedDate, qualification, appointedBy);
                            JOptionPane.showMessageDialog(frame,"Staff hired successfully");
                            break;
                        }else {
                            JOptionPane.showMessageDialog(frame,"vacancy number not found");
                        }
                    }
                }
            }
        });
	}
	
	public void two() {
		JLabel lblPartlTimeStaffhire = new JLabel("Part Time StaffHire");
		lblPartlTimeStaffhire.setBounds(300, 425, 134, 15);
		frame.getContentPane().add(lblPartlTimeStaffhire);
		
		JLabel lblVacancyNumber_2 = new JLabel("Vacancy Number :");
		lblVacancyNumber_2.setBounds(39, 485, 141, 24);
		frame.getContentPane().add(lblVacancyNumber_2);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(175, 488, 141, 19);
		frame.getContentPane().add(textField_10);
		
		JLabel lblJobTye_1 = new JLabel("Job Type :");
		lblJobTye_1.setBounds(39, 555, 70, 15);
		frame.getContentPane().add(lblJobTye_1);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(175, 553, 141, 19);
		frame.getContentPane().add(textField_11);
		
		JLabel lblDesignation_1 = new JLabel("Designation :");
		lblDesignation_1.setBounds(39, 608, 109, 15);
		frame.getContentPane().add(lblDesignation_1);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(175, 606, 141, 19);
		frame.getContentPane().add(textField_12);
		
		JLabel lblWorkingHours_1 = new JLabel("Working Hours :");
		lblWorkingHours_1.setBounds(39, 652, 129, 24);
		frame.getContentPane().add(lblWorkingHours_1);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(175, 655, 141, 19);
		frame.getContentPane().add(textField_13);
		
		JLabel lblShifts = new JLabel("Shifts :");
		lblShifts.setBounds(39, 708, 70, 15);
		frame.getContentPane().add(lblShifts);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(175, 706, 141, 19);
		frame.getContentPane().add(textField_14);
		
		JLabel lblWorkingHours_1_1 = new JLabel("Wages Per Hour :");
		lblWorkingHours_1_1.setBounds(39, 752, 129, 24);
		frame.getContentPane().add(lblWorkingHours_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(175, 757, 141, 19);
		frame.getContentPane().add(textField_15);
		
		JLabel lblStaffName_1 = new JLabel("Staff Name :");
		lblStaffName_1.setBounds(436, 490, 96, 15);
		frame.getContentPane().add(lblStaffName_1);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(578, 488, 141, 19);
		frame.getContentPane().add(textField_16);
		
		JLabel lblJoiningDate_1 = new JLabel("Joining Date :");
		lblJoiningDate_1.setBounds(436, 555, 96, 15);
		frame.getContentPane().add(lblJoiningDate_1);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(578, 553, 141, 19);
		frame.getContentPane().add(textField_17);
		
		JLabel lblQualification_1 = new JLabel("Qualification :");
		lblQualification_1.setBounds(436, 657, 109, 15);
		frame.getContentPane().add(lblQualification_1);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(578, 655, 141, 19);
		frame.getContentPane().add(textField_19);
		
		JLabel lblAppointedBy_1 = new JLabel("Appointed By :");
		lblAppointedBy_1.setBounds(436, 722, 129, 15);
		frame.getContentPane().add(lblAppointedBy_1);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(578, 720, 141, 19);
		frame.getContentPane().add(textField_20);

		JButton btnAdd_1 = new JButton("Add"); //down add
		btnAdd_1.setBounds(39, 809, 277, 25);
		frame.getContentPane().add(btnAdd_1);
		btnAdd_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int vacancy,workingHours,wageshour;
                String vacNo =textField_10.getText();
                String designation =textField_12.getText();
                String job =textField_11.getText();
                String appointed =textField_20.getText();
                String shift =textField_14.getText();
                String wages =textField_15.getText();
                String name =textField_16.getText();
                String date =textField_17.getText();
                String work =textField_13.getText();
                String qualification =textField_19.getText();

                if(vacNo.trim().equals("") || designation.trim().equals("") || job.trim().equals("") || appointed.trim().equals("") || shift.trim().equals("") || wages.trim().equals("") || name.trim().equals("") || date.trim().equals("") || work.trim().equals("") || qualification.trim().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                }else {
                    try {
                        vacancy = Integer.parseInt(vacNo);
                        workingHours = Integer.parseInt(work);
                        wageshour = Integer.parseInt(wages);
                    }catch(NumberFormatException arg) {
                        JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                        return;
                    }
                    for(StaffHire s : arrList) {
                        if(s instanceof PartTimeStaffHire) {
                            PartTimeStaffHire part = (PartTimeStaffHire) s;
                            if(part.getVacancyNumber() == vacancy) {
                                JOptionPane.showMessageDialog(frame,"staff already hired");
                            }
                        }
                    }
                    partTimeHire = new PartTimeStaffHire(vacancy, designation, job, workingHours, wageshour, shift);
                    arrList.add(partTimeHire);
                }
            }
        });
		
		JButton btnAdd_1_1 = new JButton("Appoint"); //downn appoint
		btnAdd_1_1.setBounds(436, 809, 283, 25);
		frame.getContentPane().add(btnAdd_1_1);
		btnAdd_1_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int vacancy=0;
                String vacNo =textField_10.getText();
                String designation =textField_12.getText();
                String job =textField_11.getText();
                String appointed =textField_20.getText();
                String shift =textField_14.getText();
                String wages =textField_15.getText();
                String name =textField_16.getText();
                String date =textField_17.getText();
                String work =textField_13.getText();
                String qualification =textField_19.getText();

                if(vacNo.trim().equals("") || designation.trim().equals("") || job.trim().equals("") || appointed.trim().equals("") || shift.trim().equals("") || wages.trim().equals("") || name.trim().equals("") || date.trim().equals("") || work.trim().equals("") || qualification.trim().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                }else {
                    try {
                        vacancy = Integer.parseInt(vacNo);
                    }catch(NumberFormatException arg) {
                        JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                        return;
                    }
                }
                for(int i=0;i<arrList.size();i++) {
                    StaffHire s = arrList.get(i);
                    if(s instanceof PartTimeStaffHire) {
                        PartTimeStaffHire part = (PartTimeStaffHire)s;
                        if(part.getVacancyNumber()==vacancy) {
                            part.hirePartTimeStaff(name, date, qualification, appointed);
                            JOptionPane.showMessageDialog(frame,"Staff hired successfully");
                            break;
                        }else {
                            JOptionPane.showMessageDialog(frame,"vacancy number not found");
                        }
                    }
                }

            }
        });
	}

	public void three() {
		JLabel lblStaffTermination = new JLabel("Staff Termination");
		lblStaffTermination.setBounds(300, 890, 134, 15);
		frame.getContentPane().add(lblStaffTermination);
		
		JLabel lblVacancyNumber_1_1_1 = new JLabel("Vacancy Number :");
		lblVacancyNumber_1_1_1.setBounds(175, 917, 141, 24);
		frame.getContentPane().add(lblVacancyNumber_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(310, 920, 175, 19);
		frame.getContentPane().add(textField_21);
		
		JButton btnAdd_1_1_1 = new JButton("Terminate");
		btnAdd_1_1_1.setBounds(175, 963, 313, 25);
		frame.getContentPane().add(btnAdd_1_1_1);
		btnAdd_1_1_1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String vacNo = textField_21.getText();
                int vacancy = 0;
                if(vacNo.trim().equals("")) {
                    JOptionPane.showMessageDialog(frame,"Please fill the form correctly");
                }else {
                    try {
                        vacancy = Integer.parseInt(vacNo);
                    }catch(NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(frame,"Please enter correct vacancy number");
                        return;
                    }
                }
                boolean found = false;
                for(StaffHire staff : arrList) {
                    if(staff instanceof PartTimeStaffHire) {
                        PartTimeStaffHire part = (PartTimeStaffHire) staff;
                        if(staff.getVacancyNumber() == vacancy) {
                            part.terminateStaff();
                            arrList.remove(staff);
                            JOptionPane.showMessageDialog(frame,"staff terminated succesfully");
                            found = true;
                        }
                    }
                }
                if(!found) {
                    JOptionPane.showMessageDialog(frame,"vacancy number is invalid");
                }

            }
        });
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(199, 1000, 117, 25);
		frame.getContentPane().add(btnDisplay);
		btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                for(StaffHire staff : arrList) {
                    if(staff instanceof FullTimeStaffHire) {
                        FullTimeStaffHire full = (FullTimeStaffHire)staff;
                        staff.display();
                    }else {
                        PartTimeStaffHire part = (PartTimeStaffHire)staff;
                        staff.display();
                    }
                }
            }
        });
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(339, 1000, 117, 25);
		frame.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
            }
        });
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 1116);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		one();
		two();
		three();
		
	}
}
