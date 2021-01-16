package es.studium.tema_4;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;

import java.awt.*;
public class MiLayout implements LayoutManager
{
 private static final long serialVersionUID = 1L;
public MiLayout() {}

public void addLayoutComponent( String name,Component comp) {}
public void removeLayoutComponent( Component comp) {}
 public Dimension preferredLayoutSize( Container parent )
{
 Insets insets = parent.insets();
 int numero = parent.countComponents();
 int ancho = 0;
 int alto = 0;
 for( int i=0; i < numero; i++ )
 {
 Component comp = parent.getComponent( i );
 Dimension d = comp.preferredSize();
 Point p = comp.location();
 if( ( p.x + d.width ) > ancho )
 ancho = p.x + d.width;
 if( ( p.y + d.height ) > alto )
 alto = p.y + d.height;
 }
return new Dimension( insets.left + insets.right + ancho, insets.top +
insets.bottom + alto );
 }
 public Dimension minimumLayoutSize( Container parent )
{
 Insets insets = parent.insets();
 int numero = parent.countComponents();
 int ancho = 0;
  int alto = 0;
 for( int i=0; i < numero; i++ )
 {
 Component comp = parent.getComponent( i );
 Dimension d = comp.preferredSize();
 Point p = comp.location();
 if( ( p.x + d.width ) > ancho )
 ancho = p.x + d.width;
 if( ( p.y + d.height ) > alto )
 alto = p.y + d.height;
 }
return new Dimension( insets.left + insets.right + ancho, insets.top +
insets.bottom + alto );
 }
public void layoutContainer( Container parent )
{
 int numero = parent.countComponents();
 for( int i=0; i < numero; i++ )
 {
 Component comp = parent.getComponent( i );
 Dimension d = comp.preferredSize();
 comp.resize( d.width,d.height );
 }
 }
}

