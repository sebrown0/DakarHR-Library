package library.left_menu;

import org.apache.logging.log4j.LogManager;

import core_data.CoreData;
import library.common.forms.ContainerAction;
import library.helpers.payroll_initialise.InitialisePayroll;
import library.object_models.modules.payroll.left_menu.Documents;
import library.object_models.modules.payroll.left_menu.MonthlyReports;
import library.object_models.modules.payroll.left_menu.PayrollStatistics;
import library.object_models.modules.payroll.left_menu.SettingsPayroll;
import library.object_models.modules.payroll.left_menu.YearlyReports;
import library.object_models.modules.payroll.left_menu.absence_statistics.EmployeeAccruals;
import library.object_models.modules.payroll.left_menu.absence_statistics.OtherAbsenceStatistics;
import library.object_models.modules.payroll.left_menu.bulk_updates.ColaSalaryUpdates;
import library.object_models.modules.payroll.left_menu.bulk_updates.EmployeeCreation;
import library.object_models.modules.payroll.left_menu.employee_others.AbsenceEntitlements;
import library.object_models.modules.payroll.left_menu.employee_others.Fs3QuickView;
import library.object_models.modules.payroll.left_menu.employee_others.PayslipQuickView;
import library.object_models.modules.payroll.left_menu.employees.Banks;
import library.object_models.modules.payroll.left_menu.employees.CareerProgression;
import library.object_models.modules.payroll.left_menu.employees.ContactNumbers;
import library.object_models.modules.payroll.left_menu.employees.EmployeeDetails;
import library.object_models.modules.payroll.left_menu.employees.PermanentAllowances;
import library.object_models.modules.payroll.left_menu.employees.PreviousEmployement;
import library.object_models.modules.payroll.left_menu.employees.SalaryDetails;
import library.object_models.modules.payroll.left_menu.employees.Schedule;
import library.object_models.modules.payroll.left_menu.employees.Unions;
import library.object_models.modules.payroll.left_menu.payroll.CalculatePayroll;
import library.object_models.modules.payroll.left_menu.payroll.CalculationStatistics;
import library.object_models.modules.payroll.left_menu.payroll.CloseAndLockPayroll;
import library.object_models.modules.payroll.left_menu.payroll.DetailedAdjustments;
import library.object_models.modules.payroll.left_menu.payroll.ExcelPayrollUploads;
import library.object_models.modules.payroll.left_menu.payroll.GlobalAbsences;
import library.object_models.modules.payroll.left_menu.payroll.GlobalExtras;
import library.object_models.modules.payroll.left_menu.payroll.PayrollDetails;
import library.object_models.modules.payroll.left_menu.payroll.PayrollDetailsDrillDown;
import library.object_models.modules.payroll.left_menu.reports.AbsenceRelatedReports;
import library.object_models.modules.payroll.left_menu.reports.AdjustmentsReports;
import library.object_models.modules.payroll.left_menu.reports.ChequePrinting;
import library.object_models.modules.payroll.left_menu.reports.DirectCredits;
import library.object_models.modules.payroll.left_menu.reports.GlobalPayrollAnalysis;
import library.object_models.modules.payroll.left_menu.reports.HrRelatedReports;
import library.object_models.modules.payroll.left_menu.reports.PayrollReports;
import library.object_models.modules.payroll.left_menu.reports.Payslips;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 *
 */
public class PayrollLeftMenuElementFactory implements MenuElementFactory {	
	private CoreData coreData;
		
	public PayrollLeftMenuElementFactory(CoreData coreData) {
		this.coreData = coreData;
	}

	@Override // MenuElementFactory
	public ContainerAction getElementForName(String elementName) {
		
		ContainerAction element = null;
		switch (elementName) {					
			/* Employees */		
			case EmployeeDetails.MENU_TITLE:
				element = new EmployeeDetails(coreData);
				break;			
			case ContactNumbers.MENU_TITLE:
				element = new ContactNumbers(coreData);
				break;
			case Banks.MENU_TITLE:
				element = new Banks(coreData);
				break;
			case SalaryDetails.MENU_TITLE:
				element = new SalaryDetails(coreData);
				break;
			case CareerProgression.MENU_TITLE:
				element = new CareerProgression(coreData);
				break;	
			case Schedule.MENU_TITLE:
				element = new Schedule(coreData);
				break;	
			case PermanentAllowances.MENU_TITLE:
				element = new PermanentAllowances(coreData);
				break;		
			case PreviousEmployement.MENU_TITLE:
				element = new PreviousEmployement(coreData);
				break;		
			case Unions.MENU_TITLE:
				element = new Unions(coreData);
				break;
			
			/* Employee Others */
			case AbsenceEntitlements.MENU_TITLE:
				element = new AbsenceEntitlements(coreData);
				break;
						
	
			/* Payroll */
			case InitialisePayroll.MENU_TITLE:
				element = new InitialisePayroll(coreData);
				break;
			case PayrollDetailsDrillDown.MENU_TITLE:
				element = new PayrollDetailsDrillDown(coreData);
				break;
			case DetailedAdjustments.MENU_TITLE:
				element = new DetailedAdjustments(coreData);
				break;
			case GlobalAbsences.MENU_TITLE:
				element = new GlobalAbsences(coreData);
				break;
			case GlobalExtras.MENU_TITLE:
				element = new GlobalExtras(coreData);
				break;		
			case CalculatePayroll.MENU_TITLE:
				element = new CalculatePayroll(coreData);
				break;		
			case CloseAndLockPayroll.MENU_TITLE:
				element = new CloseAndLockPayroll(coreData);
				break;		
			case PayrollDetails.MENU_TITLE:
				element = new PayrollDetails(coreData);
				break;		
			case ExcelPayrollUploads.MENU_TITLE:
				element = new ExcelPayrollUploads(coreData);
				break;		
			case CalculationStatistics.MENU_TITLE:
				element = new CalculationStatistics(coreData);
				break;						
				
			/* Employee Statistics */
			case PayslipQuickView.MENU_TITLE:
				element = new PayslipQuickView(coreData);
				break;
			case Fs3QuickView.MENU_TITLE:
				element = new Fs3QuickView(coreData);
				break;
				
			/* Payroll Statistics */
			case PayrollStatistics.MENU_TITLE:
				element = new PayrollStatistics(coreData);
				break;
				
			/* Absence Statistics */
			case EmployeeAccruals.MENU_TITLE:
				element = new EmployeeAccruals(coreData);
				break;
			case OtherAbsenceStatistics.MENU_TITLE:
				element = new OtherAbsenceStatistics(coreData);
				break;	
				
			/* Reports */
			case PayrollReports.MENU_TITLE:
				element = new PayrollReports(coreData);
				break;
			case Payslips.MENU_TITLE:
				element = new Payslips(coreData);
				break;
			case DirectCredits.MENU_TITLE:
				element = new DirectCredits(coreData);
				break;
			case GlobalPayrollAnalysis.MENU_TITLE:
				element = new GlobalPayrollAnalysis(coreData);
				break;
			case ChequePrinting.MENU_TITLE:
				element = new ChequePrinting(coreData);
				break;
			case AdjustmentsReports.MENU_TITLE:
				element = new AdjustmentsReports(coreData);
				break;
			case HrRelatedReports.MENU_TITLE:
				element = new HrRelatedReports(coreData);
				break;
			case AbsenceRelatedReports.MENU_TITLE:
				element = new AbsenceRelatedReports(coreData);
				break;	
				
			/* Monthly Reports */
			case MonthlyReports.MENU_TITLE:
				element = new MonthlyReports(coreData);
				break;
				
			/* Yearly Reports */
			case YearlyReports.MENU_TITLE:
				element = new YearlyReports(coreData);
				break;
	
			/* Bulk Updates */
			case ColaSalaryUpdates.MENU_TITLE:
				element = new ColaSalaryUpdates(coreData);
				break;
			case EmployeeCreation.MENU_TITLE:
				element = new EmployeeCreation(coreData);
				break;
	
			/* Payroll Settings */
			case SettingsPayroll.MENU_TITLE:
				element = new SettingsPayroll(coreData);
				break;
				
			/* Stand Alone */
			case Documents.MENU_TITLE:				
				element = new Documents(coreData);
				break;
	
			default:
				LogManager.getLogger().error("Could not create [" + elementName + "]");				
				break;
		}		
		return element;
	}

}
