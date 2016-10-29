package com.quartzdesk.test.common.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomEditorRegistrar
    implements PropertyEditorRegistrar
{
  private static final Logger log = LoggerFactory.getLogger( CustomEditorRegistrar.class );

  @Override
  public void registerCustomEditors( PropertyEditorRegistry registry )
  {
    registry.registerCustomEditor( Date.class, new CustomDateEditor( new SimpleDateFormat( "yyyy-MM-dd" ), false ) );
  }
}
