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

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.LifestyleModification.Properties{

}
}