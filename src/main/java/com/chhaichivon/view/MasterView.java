package com.chhaichivon.view;

import org.zkoss.spring.DelegatingVariableResolver;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

/**
 * @author: Chhai Chivon on 5/22/18.
 */
@VariableResolver(DelegatingVariableResolver.class)
public class MasterView extends SelectorComposer<Component> {

}
