package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object menuAddOn extends PropertyDef(
        iri = "http://schema.org/menuAddOn",
        iris = Set("http://schema.org/menuAddOn"),
        label = "menuAddOn",
        comment = """Additional menu item(s) such as a side dish of salad or side order of fries that can be added to this menu item. Additionally it can be a menu section containing allowed add-on menu items for this menu item.""",
        `@extends` = () => List(),
        `@range` = () => List(MenuItem.ontology, MenuSection.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}