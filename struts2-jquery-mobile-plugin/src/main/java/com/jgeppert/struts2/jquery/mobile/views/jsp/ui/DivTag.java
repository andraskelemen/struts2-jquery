/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jgeppert.struts2.jquery.mobile.views.jsp.ui;

import com.jgeppert.struts2.jquery.mobile.components.Div;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.components.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <a href="http://www.jgeppert.com">Johannes Geppert</a>
 * @see com.jgeppert.struts2.jquery.mobile.components.Div
 */
public class DivTag extends org.apache.struts2.views.jsp.ui.AbstractClosingTag implements ThemeableTag {

    private static final long serialVersionUID = 5331150687827132425L;

    protected String role;
    protected String dataTheme;

    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Div(stack, req, res);
    }

    protected void populateParams() {
        super.populateParams();

        Div div = (Div) component;
        div.setRole(role);
        div.setDataTheme(dataTheme);
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDataTheme(String dataTheme) {
        this.dataTheme = dataTheme;
    }
}
