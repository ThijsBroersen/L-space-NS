package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Course
    extends OntologyDef(
      iri = "http://schema.org/Course",
      iris = Set("http://schema.org/Course"),
      label = "Course",
      comment =
        """A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val hasCourseInstance            = lspace.ns.vocab.schema.hasCourseInstance.property
    lazy val educationalCredentialAwarded = lspace.ns.vocab.schema.educationalCredentialAwarded.property
    lazy val coursePrerequisites          = lspace.ns.vocab.schema.coursePrerequisites.property
    lazy val courseCode                   = lspace.ns.vocab.schema.courseCode.property
  }
  override lazy val properties: List[LProperty] =
    List(hasCourseInstance, educationalCredentialAwarded, coursePrerequisites, courseCode)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val hasCourseInstance            = lspace.ns.vocab.schema.hasCourseInstance.property
    lazy val educationalCredentialAwarded = lspace.ns.vocab.schema.educationalCredentialAwarded.property
    lazy val coursePrerequisites          = lspace.ns.vocab.schema.coursePrerequisites.property
    lazy val courseCode                   = lspace.ns.vocab.schema.courseCode.property
  }
}
