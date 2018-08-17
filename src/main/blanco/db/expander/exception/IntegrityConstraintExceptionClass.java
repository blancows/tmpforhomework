/*
 * blancoDb Enterprise Edition
 * Copyright (C) 2004-2005 Tosiki Iga
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db.expander.exception;

import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;

/**
 * データベース制約違反に関する例外クラス
 * 
 * このクラスが生成するクラスはblancoDbが生成したソースコードで利用されます
 * 
 * @since 2005.05.12
 * @author IGA Tosiki
 */
public class IntegrityConstraintExceptionClass {
    /**
     * 例外クラスのクラス名
     */
    public static final String CLASS_NAME = "IntegrityConstraintException";

    /**
     * コンストラクタに示すJavaDoc説明。
     */
    private static final String CONSTRUCTOR_JAVADOC = "制約違反が発生したことを示す例外オブジェクト のインスタンスを作成します。";

    /**
     * blancoCg オブジェクトファクトリ。
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * このクラスが含まれるソースコード。
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    public IntegrityConstraintExceptionClass(
            final BlancoCgObjectFactory cgFactory, final String argPackage) {
        fCgFactory = cgFactory;
        fCgSourceFile = fCgFactory.createSourceFile(argPackage,
                "This code is generated by blanco Framework.");
    }

    public BlancoCgSourceFile expand() {
        final BlancoCgClass cgClass = fCgFactory.createClass(CLASS_NAME, null);
        fCgSourceFile.getClassList().add(cgClass);

        cgClass.getExtendClassList().add(
                fCgFactory.createType("java.sql.SQLException"));

        {
            final List<String> listDesc = cgClass.getLangDoc()
                    .getDescriptionList();

            listDesc.add("データベース制約違反に関する例外クラス <br>");
            listDesc.add("このクラスはblancoDbが生成したソースコードで利用されます <br>");
            listDesc.add("※このクラスは、ソースコード自動生成後のファイルとして利用されます。");
            listDesc.add("");
            listDesc.add("@since 2005.05.12");
            listDesc.add("@author blanco Framework");
        }

        {
            final BlancoCgField cgField = fCgFactory.createField(
                    "SQLSTATE_INTEGRITYCONSTRAINT", "java.lang.String",
                    "このクラスを表現するSQLStateコード。");
            cgClass.getFieldList().add(cgField);
            cgField.setAccess("protected");
            cgField.setStatic(true);
            cgField.setFinal(true);
            cgField.setDefault("\"23000\"");
        }

        {
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(CLASS_NAME,
                    CONSTRUCTOR_JAVADOC);
            cgClass.getMethodList().add(cgMethod);

            cgMethod.setConstructor(true);
            cgMethod
                    .getLangDoc()
                    .getDescriptionList()
                    .add(
                            "@deprecated このコンストラクタはなるべく利用せずに、もとの例外のSQLStateやvenderCodeを利用可能な別のコンストラクタを利用してください。");

            cgMethod
                    .getLineList()
                    .add(
                            "super(\"Integrity consrtraint exception has occured.\", SQLSTATE_INTEGRITYCONSTRAINT);");
        }

        {
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(CLASS_NAME,
                    CONSTRUCTOR_JAVADOC);
            cgClass.getMethodList().add(cgMethod);

            cgMethod.setConstructor(true);
            cgMethod
                    .getLangDoc()
                    .getDescriptionList()
                    .add(
                            "@deprecated このコンストラクタはなるべく利用せずに、もとの例外のSQLStateやvenderCodeを利用可能な別のコンストラクタを利用してください。");
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("reason", "java.lang.String",
                            "例外の説明"));

            cgMethod.getLineList().add(
                    "super(reason, SQLSTATE_INTEGRITYCONSTRAINT);");
        }

        {
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(CLASS_NAME,
                    CONSTRUCTOR_JAVADOC);
            cgClass.getMethodList().add(cgMethod);

            cgMethod.setConstructor(true);
            cgMethod
                    .getLangDoc()
                    .getDescriptionList()
                    .add(
                            "@deprecated このコンストラクタはなるべく利用せずに、もとの例外のSQLStateやvenderCodeを利用可能な別のコンストラクタを利用してください。");
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("reason", "java.lang.String",
                            "例外の説明"));
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("SQLState", "java.lang.String",
                            "例外を識別する XOPENコードまたは SQL 99のコード"));

            cgMethod.getLineList().add("super(reason, SQLState);");
        }

        {
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(CLASS_NAME,
                    CONSTRUCTOR_JAVADOC);
            cgClass.getMethodList().add(cgMethod);

            cgMethod.setConstructor(true);
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("reason", "java.lang.String",
                            "例外の説明"));
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("SQLState", "java.lang.String",
                            "例外を識別する XOPENコードまたは SQL 99のコード"));
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("vendorCode", "int",
                            "データベースベンダーが定める固有の例外コード"));

            cgMethod.getLineList().add("super(reason, SQLState, vendorCode);");
        }

        return fCgSourceFile;
    }
}