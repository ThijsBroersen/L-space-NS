package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationTransposes extends PropertyDef(
        iri = "http://schema.org/legislationTransposes",
        iris = Set("http://schema.org/legislationTransposes"),
        label = "legislationTransposes",
        comment = """Indicates that this legislation (or part of legislation) fulfills the objectives set by another legislation, by passing appropriate implementation measures. Typically, some legislations of European Union's member states or regions transpose European Directives. This indicates a legally binding link between the 2 legislations.""",
        `@extends` = () => List(legislationApplies.property),
        `@range` = () => List(Legislation.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.legislationApplies.Properties
}