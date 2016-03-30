/**
 * generated by Xtext 2.9.2
 */
package org.pds16.pds16asm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pds16.pds16asm.HexaDecimal;
import org.pds16.pds16asm.Indexed;
import org.pds16.pds16asm.Model;
import org.pds16.pds16asm.OperationLD2;
import org.pds16.pds16asm.OperationLDI;
import org.pds16.pds16asm.Operations;
import org.pds16.pds16asm.Pds16asmFactory;
import org.pds16.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.Registers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pds16asmPackageImpl extends EPackageImpl implements Pds16asmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationLDIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationLD2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexaDecimalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass registersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass r1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass r2EClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.pds16.pds16asm.Pds16asmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Pds16asmPackageImpl()
  {
    super(eNS_URI, Pds16asmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Pds16asmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Pds16asmPackage init()
  {
    if (isInited) return (Pds16asmPackage)EPackage.Registry.INSTANCE.getEPackage(Pds16asmPackage.eNS_URI);

    // Obtain or create and register package
    Pds16asmPackageImpl thePds16asmPackage = (Pds16asmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pds16asmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pds16asmPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePds16asmPackage.createPackageContents();

    // Initialize created meta-data
    thePds16asmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePds16asmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Pds16asmPackage.eNS_URI, thePds16asmPackage);
    return thePds16asmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Operations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperations()
  {
    return operationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperations_Register()
  {
    return (EReference)operationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationLDI()
  {
    return operationLDIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationLDI_Immediate8()
  {
    return (EReference)operationLDIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationLD2()
  {
    return operationLD2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationLD2_Indexed()
  {
    return (EReference)operationLD2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexed()
  {
    return indexedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexed_Reg()
  {
    return (EReference)indexedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexed_Imediate8()
  {
    return (EReference)indexedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHexaDecimal()
  {
    return hexaDecimalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHexaDecimal_Number()
  {
    return (EAttribute)hexaDecimalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegisters()
  {
    return registersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegisters_Value()
  {
    return (EAttribute)registersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getR1()
  {
    return r1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getR2()
  {
    return r2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pds16asmFactory getPds16asmFactory()
  {
    return (Pds16asmFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__OPERATIONS);

    operationsEClass = createEClass(OPERATIONS);
    createEReference(operationsEClass, OPERATIONS__REGISTER);

    operationLDIEClass = createEClass(OPERATION_LDI);
    createEReference(operationLDIEClass, OPERATION_LDI__IMMEDIATE8);

    operationLD2EClass = createEClass(OPERATION_LD2);
    createEReference(operationLD2EClass, OPERATION_LD2__INDEXED);

    indexedEClass = createEClass(INDEXED);
    createEReference(indexedEClass, INDEXED__REG);
    createEReference(indexedEClass, INDEXED__IMEDIATE8);

    hexaDecimalEClass = createEClass(HEXA_DECIMAL);
    createEAttribute(hexaDecimalEClass, HEXA_DECIMAL__NUMBER);

    registersEClass = createEClass(REGISTERS);
    createEAttribute(registersEClass, REGISTERS__VALUE);

    r1EClass = createEClass(R1);

    r2EClass = createEClass(R2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    operationLDIEClass.getESuperTypes().add(this.getOperations());
    operationLD2EClass.getESuperTypes().add(this.getOperations());
    r1EClass.getESuperTypes().add(this.getRegisters());
    r2EClass.getESuperTypes().add(this.getRegisters());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Operations(), this.getOperations(), null, "operations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationsEClass, Operations.class, "Operations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperations_Register(), this.getRegisters(), null, "register", null, 0, 1, Operations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationLDIEClass, OperationLDI.class, "OperationLDI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationLDI_Immediate8(), this.getHexaDecimal(), null, "immediate8", null, 0, 1, OperationLDI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationLD2EClass, OperationLD2.class, "OperationLD2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationLD2_Indexed(), this.getIndexed(), null, "indexed", null, 0, 1, OperationLD2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexedEClass, Indexed.class, "Indexed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndexed_Reg(), this.getRegisters(), null, "reg", null, 0, 1, Indexed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexed_Imediate8(), this.getHexaDecimal(), null, "imediate8", null, 0, 1, Indexed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hexaDecimalEClass, HexaDecimal.class, "HexaDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHexaDecimal_Number(), ecorePackage.getEString(), "number", null, 0, 1, HexaDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registersEClass, Registers.class, "Registers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegisters_Value(), ecorePackage.getEString(), "value", null, 0, 1, Registers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(r1EClass, org.pds16.pds16asm.R1.class, "R1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(r2EClass, org.pds16.pds16asm.R2.class, "R2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Pds16asmPackageImpl
