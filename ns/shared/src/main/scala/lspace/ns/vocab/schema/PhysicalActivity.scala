package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PhysicalActivity extends OntologyDef(
        iri = "http://schema.org/PhysicalActivity",
        iris = Set("http://schema.org/PhysicalActivity"),
        label = "PhysicalActivity",
        comment = """Any bodily activity that enhances or maintains physical fitness and overall health and wellness. Includes activity that is part of daily living and routine, structured exercise, and exercise prescribed as part of a medical treatment or recovery plan.""",
        `@extends` = () => List(LifestyleModification.ontology)
       ){
object keys extends lspace.ns.vocab.schema.LifestyleModification.Properties{
lazy val associatedAnatomy = lspace.ns.vocab.schema.associatedAnatomy.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val epidemiology = lspace.ns.vocab.schema.epidemiology.property
lazy val pathophysiology = lspace.ns.vocab.schema.pathophysiology.property
}
override lazy val properties: List[LProperty] = List(associatedAnatomy, category, epidemiology, pathophysiology)
trait Properties extends lspace.ns.vocab.schema.LifestyleModification.Properties{
lazy val associatedAnatomy = lspace.ns.vocab.schema.associatedAnatomy.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val epidemiology = lspace.ns.vocab.schema.epidemiology.property
lazy val pathophysiology = lspace.ns.vocab.schema.pathophysiology.property
}
}