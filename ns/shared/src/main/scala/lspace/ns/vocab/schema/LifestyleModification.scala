package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LifestyleModification extends OntologyDef(
        iri = "http://schema.org/LifestyleModification",
        iris = Set("http://schema.org/LifestyleModification"),
        label = "LifestyleModification",
        comment = """A process of care involving exercise, changes to diet, fitness routines, and other lifestyle changes aimed at improving a health condition.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{

}
}