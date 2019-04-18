package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BreadcrumbList extends OntologyDef(
        iri = "http://schema.org/BreadcrumbList",
        iris = Set("http://schema.org/BreadcrumbList"),
        label = "BreadcrumbList",
        comment = """A BreadcrumbList is an ItemList consisting of a chain of linked Web pages, typically described using at least their URL and their name, and typically ending with the current page.<br/><br/>

The <a class="localLink" href="http://schema.org/position">position</a> property is used to reconstruct the order of the items in a BreadcrumbList The convention is that a breadcrumb list has an <a class="localLink" href="http://schema.org/itemListOrder">itemListOrder</a> of <a class="localLink" href="http://schema.org/ItemListOrderAscending">ItemListOrderAscending</a> (lower values listed first), and that the first items in this list correspond to the "top" or beginning of the breadcrumb trail, e.g. with a site or section homepage. The specific values of 'position' are not assigned meaning for a BreadcrumbList, but they should be integers, e.g. beginning with '1' for the first item in the list.""",
        `@extends` = () => List(ItemList.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ItemList.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.ItemList.Properties{

}
}