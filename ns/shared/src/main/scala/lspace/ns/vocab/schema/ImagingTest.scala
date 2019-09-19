package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ImagingTest extends OntologyDef(
        iri = "http://schema.org/ImagingTest",
        iris = Set("http://schema.org/ImagingTest"),
        label = "ImagingTest",
        comment = """Any medical imaging modality typically used for diagnostic purposes.""",
        `@extends` = () => List(MedicalTest.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalTest.Properties{
lazy val imagingTechnique = lspace.ns.vocab.schema.imagingTechnique.property
}
override lazy val properties: List[LProperty] = List(imagingTechnique)
trait Properties extends lspace.ns.vocab.schema.MedicalTest.Properties{
lazy val imagingTechnique = lspace.ns.vocab.schema.imagingTechnique.property
}
}