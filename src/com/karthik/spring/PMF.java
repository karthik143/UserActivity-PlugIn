package com.karthik.spring;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public final class PMF {     
    private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");

    public static synchronized PersistenceManager get() {        
        return pmfInstance.getPersistenceManager();
    }
}
