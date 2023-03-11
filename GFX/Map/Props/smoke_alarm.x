xof 0303txt 0032

// DirectX 9.0 file
// Creator: Ultimate Unwrap3D Pro v3.15
// Time: Tue Aug 11 11:57:29 2009

// Start of Templates

template VertexDuplicationIndices {
 <b8d65549-d7c9-4995-89cf-53a9a8b031e3>
 DWORD nIndices;
 DWORD nOriginalVertices;
 array DWORD indices[nIndices];
}

template FVFData {
 <b6e70a0e-8ef9-4e83-94ad-ecc8b0c04897>
 DWORD dwFVF;
 DWORD nDWords;
 array DWORD data[nDWords];
}

template Header {
 <3D82AB43-62DA-11cf-AB39-0020AF71E433>
 WORD major;
 WORD minor;
 DWORD flags;
}

template Vector {
 <3D82AB5E-62DA-11cf-AB39-0020AF71E433>
 FLOAT x;
 FLOAT y;
 FLOAT z;
}

template Coords2d {
 <F6F23F44-7686-11cf-8F52-0040333594A3>
 FLOAT u;
 FLOAT v;
}

template Matrix4x4 {
 <F6F23F45-7686-11cf-8F52-0040333594A3>
 array FLOAT matrix[16];
}

template ColorRGBA {
 <35FF44E0-6C7C-11cf-8F52-0040333594A3>
 FLOAT red;
 FLOAT green;
 FLOAT blue;
 FLOAT alpha;
}

template ColorRGB {
 <D3E16E81-7835-11cf-8F52-0040333594A3>
 FLOAT red;
 FLOAT green;
 FLOAT blue;
}

template IndexedColor {
 <1630B820-7842-11cf-8F52-0040333594A3>
 DWORD index;
 ColorRGBA indexColor;
}

template Material {
 <3D82AB4D-62DA-11cf-AB39-0020AF71E433>
 ColorRGBA faceColor;
 FLOAT power;
 ColorRGB specularColor;
 ColorRGB emissiveColor;
 [...]
}

template TextureFilename {
 <A42790E1-7810-11cf-8F52-0040333594A3>
 STRING filename;
}

template MeshFace {
 <3D82AB5F-62DA-11cf-AB39-0020AF71E433>
 DWORD nFaceVertexIndices;
 array DWORD faceVertexIndices[nFaceVertexIndices];
}

template MeshTextureCoords {
 <F6F23F40-7686-11cf-8F52-0040333594A3>
 DWORD nTextureCoords;
 array Coords2d textureCoords[nTextureCoords];
}

template MeshMaterialList {
 <F6F23F42-7686-11cf-8F52-0040333594A3>
 DWORD nMaterials;
 DWORD nFaceIndexes;
 array DWORD faceIndexes[nFaceIndexes];
 [Material]
}

template MeshNormals {
 <F6F23F43-7686-11cf-8F52-0040333594A3>
 DWORD nNormals;
 array Vector normals[nNormals];
 DWORD nFaceNormals;
 array MeshFace faceNormals[nFaceNormals];
}

template MeshVertexColors {
 <1630B821-7842-11cf-8F52-0040333594A3>
 DWORD nVertexColors;
 array IndexedColor vertexColors[nVertexColors];
}

template Mesh {
 <3D82AB44-62DA-11cf-AB39-0020AF71E433>
 DWORD nVertices;
 array Vector vertices[nVertices];
 DWORD nFaces;
 array MeshFace faces[nFaces];
 [...]
}

template FrameTransformMatrix {
 <F6F23F41-7686-11cf-8F52-0040333594A3>
 Matrix4x4 frameMatrix;
}

template Frame {
 <3D82AB46-62DA-11cf-AB39-0020AF71E433>
 [...]
}

template FloatKeys {
 <10DD46A9-775B-11cf-8F52-0040333594A3>
 DWORD nValues;
 array FLOAT values[nValues];
}

template TimedFloatKeys {
 <F406B180-7B3B-11cf-8F52-0040333594A3>
 DWORD time;
 FloatKeys tfkeys;
}

template AnimationKey {
 <10DD46A8-775B-11cf-8F52-0040333594A3>
 DWORD keyType;
 DWORD nKeys;
 array TimedFloatKeys keys[nKeys];
}

template AnimationOptions {
 <E2BF56C0-840F-11cf-8F52-0040333594A3>
 DWORD openclosed;
 DWORD positionquality;
}

template Animation {
 <3D82AB4F-62DA-11cf-AB39-0020AF71E433>
 [...]
}

template AnimationSet {
 <3D82AB50-62DA-11cf-AB39-0020AF71E433>
 [Animation]
}

template XSkinMeshHeader {
 <3CF169CE-FF7C-44ab-93C0-F78F62D172E2>
 WORD nMaxSkinWeightsPerVertex;
 WORD nMaxSkinWeightsPerFace;
 WORD nBones;
}

template SkinWeights {
 <6F0D123B-BAD2-4167-A0D0-80224F25FABB>
 STRING transformNodeName;
 DWORD nWeights;
 array DWORD vertexIndices[nWeights];
 array FLOAT weights[nWeights];
 Matrix4x4 matrixOffset;
}

template AnimTicksPerSecond {
 <9E415A43-7BA6-4a73-8743-B73D47E88476>
 DWORD AnimTicksPerSecond;
}

AnimTicksPerSecond {
 30;
}

// Start of Frames

Frame Body {
   FrameTransformMatrix {
    1.000000, 0.000000, 0.000000, 0.000000,
    0.000000, 1.000000, 0.000000, 0.000000,
    0.000000, 0.000000, 1.000000, 0.000000,
    0.000000, 0.000000, 0.000000, 1.000000;;
   }

   Mesh staticMesh {
    102;
    0.975700; 1.133102; -3.002754;,
    0.000000; 1.133102; -3.157349;,
    0.975700; 0.239300; -3.002754;,
    0.000000; 0.239300; -3.157349;,
    1.855801; 1.133102; -2.554352;,
    1.855801; 0.239300; -2.554352;,
    2.554300; 1.133102; -1.855850;,
    2.554300; 0.239300; -1.855850;,
    3.002800; 1.133102; -0.975655;,
    3.002800; 0.239300; -0.975655;,
    3.157301; 1.133102; 0.000046;,
    3.157301; 0.239300; 0.000046;,
    3.002800; 1.133102; 0.975647;,
    3.002800; 0.239300; 0.975647;,
    2.554300; 1.133102; 1.855850;,
    2.554300; 0.239300; 1.855850;,
    1.855801; 1.133102; 2.554348;,
    1.855801; 0.239300; 2.554348;,
    0.975700; 1.133102; 3.002747;,
    0.975700; 0.239300; 3.002747;,
    0.000000; 1.133102; 3.157349;,
    0.000000; 0.239300; 3.157349;,
    -0.975698; 1.133102; 3.002747;,
    0.000000; 1.133102; 3.157349;,
    -0.975698; 0.239300; 3.002747;,
    0.000000; 0.239300; 3.157349;,
    -1.855799; 1.133102; 2.554348;,
    -1.855799; 0.239300; 2.554348;,
    -2.554300; 1.133102; 1.855850;,
    -2.554300; 0.239300; 1.855850;,
    -3.002800; 1.133102; 0.975647;,
    -3.002800; 0.239300; 0.975647;,
    -3.157299; 1.133102; 0.000046;,
    -3.157299; 0.239300; 0.000046;,
    -3.002800; 1.133102; -0.975655;,
    -3.002800; 0.239300; -0.975655;,
    -2.554300; 1.133102; -1.855850;,
    -2.554300; 0.239300; -1.855850;,
    -1.855799; 1.133102; -2.554352;,
    -1.855799; 0.239300; -2.554352;,
    -0.975698; 1.133102; -3.002754;,
    -0.975698; 0.239300; -3.002754;,
    0.000000; 0.000000; -2.025253;,
    -0.625900; 0.000000; -1.926155;,
    0.625900; 0.000000; -1.926155;,
    -1.190399; 0.000000; -1.638550;,
    1.190401; 0.000000; -1.638550;,
    -1.638500; 0.000000; -1.190453;,
    1.638500; 0.000000; -1.190453;,
    -1.926199; 0.000000; -0.625854;,
    1.926201; 0.000000; -0.625854;,
    -2.025299; 0.000000; 0.000046;,
    2.025301; 0.000000; 0.000046;,
    -1.926199; 0.000000; 0.625847;,
    1.926201; 0.000000; 0.625847;,
    -1.638500; 0.000000; 1.190445;,
    1.638500; 0.000000; 1.190445;,
    -1.190399; 0.000000; 1.638550;,
    1.190401; 0.000000; 1.638550;,
    -0.625900; 0.000000; 1.926147;,
    0.625900; 0.000000; 1.926147;,
    0.000000; 0.000000; 2.025345;,
    -0.975698; 1.133102; -3.002754;,
    0.000000; 1.133102; -3.157349;,
    -1.855799; 1.133102; -2.554352;,
    0.975700; 1.133102; -3.002754;,
    -2.554300; 1.133102; -1.855850;,
    1.855801; 1.133102; -2.554352;,
    -3.002800; 1.133102; -0.975655;,
    2.554300; 1.133102; -1.855850;,
    -3.157299; 1.133102; 0.000046;,
    3.002800; 1.133102; -0.975655;,
    -3.002800; 1.133102; 0.975647;,
    3.157301; 1.133102; 0.000046;,
    -2.554300; 1.133102; 1.855850;,
    3.002800; 1.133102; 0.975647;,
    -1.855799; 1.133102; 2.554348;,
    2.554300; 1.133102; 1.855850;,
    -0.975698; 1.133102; 3.002747;,
    1.855801; 1.133102; 2.554348;,
    0.000000; 1.133102; 3.157349;,
    0.975700; 1.133102; 3.002747;,
    2.554300; 0.239300; -1.855850;,
    1.855801; 0.239300; -2.554352;,
    3.002800; 0.239300; -0.975655;,
    3.157301; 0.239300; 0.000046;,
    3.002800; 0.239300; 0.975647;,
    2.554300; 0.239300; 1.855850;,
    1.855801; 0.239300; 2.554348;,
    0.975700; 0.239300; 3.002747;,
    0.000000; 0.239300; 3.157349;,
    -0.975698; 0.239300; 3.002747;,
    -1.855799; 0.239300; 2.554348;,
    -2.554300; 0.239300; 1.855850;,
    -3.002800; 0.239300; 0.975647;,
    -3.157299; 0.239300; 0.000046;,
    -3.002800; 0.239300; -0.975655;,
    -2.554300; 0.239300; -1.855850;,
    -1.855799; 0.239300; -2.554352;,
    -0.975698; 0.239300; -3.002754;,
    0.000000; 0.239300; -3.157349;,
    0.975700; 0.239300; -3.002754;;
    116;
    3;2, 1, 0;,
    3;2, 3, 1;,
    3;5, 0, 4;,
    3;5, 2, 0;,
    3;7, 4, 6;,
    3;7, 5, 4;,
    3;9, 6, 8;,
    3;9, 7, 6;,
    3;11, 8, 10;,
    3;11, 9, 8;,
    3;13, 10, 12;,
    3;13, 11, 10;,
    3;15, 12, 14;,
    3;15, 13, 12;,
    3;17, 14, 16;,
    3;17, 15, 14;,
    3;19, 16, 18;,
    3;19, 17, 16;,
    3;21, 18, 20;,
    3;21, 19, 18;,
    3;24, 23, 22;,
    3;24, 25, 23;,
    3;27, 22, 26;,
    3;27, 24, 22;,
    3;29, 26, 28;,
    3;29, 27, 26;,
    3;31, 28, 30;,
    3;31, 29, 28;,
    3;33, 30, 32;,
    3;33, 31, 30;,
    3;35, 32, 34;,
    3;35, 33, 32;,
    3;37, 34, 36;,
    3;37, 35, 34;,
    3;39, 36, 38;,
    3;39, 37, 36;,
    3;41, 38, 40;,
    3;41, 39, 38;,
    3;3, 40, 1;,
    3;3, 41, 40;,
    3;44, 43, 42;,
    3;44, 45, 43;,
    3;46, 45, 44;,
    3;46, 47, 45;,
    3;48, 47, 46;,
    3;48, 49, 47;,
    3;50, 49, 48;,
    3;50, 51, 49;,
    3;52, 51, 50;,
    3;52, 53, 51;,
    3;54, 53, 52;,
    3;54, 55, 53;,
    3;56, 55, 54;,
    3;56, 57, 55;,
    3;58, 57, 56;,
    3;58, 59, 57;,
    3;60, 59, 58;,
    3;60, 61, 59;,
    3;64, 63, 62;,
    3;64, 65, 63;,
    3;66, 65, 64;,
    3;66, 67, 65;,
    3;68, 67, 66;,
    3;68, 69, 67;,
    3;70, 69, 68;,
    3;70, 71, 69;,
    3;72, 71, 70;,
    3;72, 73, 71;,
    3;74, 73, 72;,
    3;74, 75, 73;,
    3;76, 75, 74;,
    3;76, 77, 75;,
    3;78, 77, 76;,
    3;78, 79, 77;,
    3;80, 79, 78;,
    3;80, 81, 79;,
    3;48, 83, 82;,
    3;48, 46, 83;,
    3;50, 82, 84;,
    3;50, 48, 82;,
    3;52, 84, 85;,
    3;52, 50, 84;,
    3;54, 85, 86;,
    3;54, 52, 85;,
    3;56, 86, 87;,
    3;56, 54, 86;,
    3;58, 87, 88;,
    3;58, 56, 87;,
    3;60, 88, 89;,
    3;60, 58, 88;,
    3;61, 89, 90;,
    3;61, 60, 89;,
    3;59, 90, 91;,
    3;59, 61, 90;,
    3;57, 91, 92;,
    3;57, 59, 91;,
    3;55, 92, 93;,
    3;55, 57, 92;,
    3;53, 93, 94;,
    3;53, 55, 93;,
    3;51, 94, 95;,
    3;51, 53, 94;,
    3;49, 95, 96;,
    3;49, 51, 95;,
    3;47, 96, 97;,
    3;47, 49, 96;,
    3;45, 97, 98;,
    3;45, 47, 97;,
    3;43, 98, 99;,
    3;43, 45, 98;,
    3;42, 99, 100;,
    3;42, 43, 99;,
    3;44, 100, 101;,
    3;44, 42, 100;,
    3;46, 101, 83;,
    3;46, 44, 101;;

   MeshNormals {
    102;
    0.275716; 0.451654; -0.848522;,
    -0.000000; 0.451660; -0.892190;,
    0.239117; -0.633477; -0.735887;,
    -0.000001; -0.633483; -0.773756;,
    0.524407; 0.451657; -0.721805;,
    0.454797; -0.633478; -0.625992;,
    0.721795; 0.451656; -0.524423;,
    0.625983; -0.633477; -0.454810;,
    0.848527; 0.451658; -0.275694;,
    0.735892; -0.633478; -0.239098;,
    0.892193; 0.451655; 0.000007;,
    0.773763; -0.633475; 0.000006;,
    0.848525; 0.451657; 0.275699;,
    0.735891; -0.633478; 0.239103;,
    0.721795; 0.451656; 0.524422;,
    0.625983; -0.633477; 0.454810;,
    0.524405; 0.451657; 0.721807;,
    0.454795; -0.633478; 0.625993;,
    0.275718; 0.451654; 0.848521;,
    0.239119; -0.633474; 0.735889;,
    -0.000000; 0.451660; 0.892190;,
    -0.000000; -0.633481; 0.773759;,
    -0.275718; 0.451654; 0.848521;,
    -0.000000; 0.451660; 0.892190;,
    -0.239119; -0.633473; 0.735889;,
    -0.000000; -0.633481; 0.773759;,
    -0.524405; 0.451657; 0.721807;,
    -0.454794; -0.633478; 0.625993;,
    -0.721794; 0.451656; 0.524423;,
    -0.625983; -0.633477; 0.454810;,
    -0.848526; 0.451658; 0.275699;,
    -0.735891; -0.633478; 0.239102;,
    -0.892193; 0.451655; 0.000007;,
    -0.773763; -0.633475; 0.000006;,
    -0.848527; 0.451658; -0.275693;,
    -0.735892; -0.633478; -0.239098;,
    -0.721794; 0.451656; -0.524423;,
    -0.625983; -0.633476; -0.454811;,
    -0.524407; 0.451657; -0.721805;,
    -0.454796; -0.633478; -0.625992;,
    -0.275716; 0.451654; -0.848522;,
    -0.239118; -0.633474; -0.735889;,
    -0.000001; -0.990360; -0.138519;,
    -0.042809; -0.990359; -0.131745;,
    0.042808; -0.990359; -0.131741;,
    -0.081421; -0.990359; -0.112070;,
    0.081421; -0.990359; -0.112070;,
    -0.112069; -0.990359; -0.081424;,
    0.112068; -0.990359; -0.081424;,
    -0.131746; -0.990359; -0.042805;,
    0.131746; -0.990359; -0.042805;,
    -0.138526; -0.990359; 0.000001;,
    0.138526; -0.990359; 0.000001;,
    -0.131745; -0.990359; 0.042806;,
    0.131746; -0.990359; 0.042806;,
    -0.112068; -0.990359; 0.081424;,
    0.112069; -0.990359; 0.081424;,
    -0.081421; -0.990359; 0.112070;,
    0.081421; -0.990359; 0.112070;,
    -0.042809; -0.990359; 0.131746;,
    0.042809; -0.990359; 0.131745;,
    -0.000000; -0.990359; 0.138524;,
    -0.275716; 0.451654; -0.848522;,
    -0.000000; 0.451660; -0.892190;,
    -0.524407; 0.451657; -0.721805;,
    0.275716; 0.451654; -0.848522;,
    -0.721794; 0.451656; -0.524423;,
    0.524407; 0.451657; -0.721805;,
    -0.848527; 0.451658; -0.275693;,
    0.721795; 0.451656; -0.524423;,
    -0.892193; 0.451655; 0.000007;,
    0.848527; 0.451658; -0.275694;,
    -0.848526; 0.451658; 0.275699;,
    0.892193; 0.451655; 0.000007;,
    -0.721794; 0.451656; 0.524423;,
    0.848525; 0.451657; 0.275699;,
    -0.524405; 0.451657; 0.721807;,
    0.721795; 0.451656; 0.524422;,
    -0.275718; 0.451654; 0.848521;,
    0.524405; 0.451657; 0.721807;,
    -0.000000; 0.451660; 0.892190;,
    0.275718; 0.451654; 0.848521;,
    0.625983; -0.633477; -0.454810;,
    0.454797; -0.633478; -0.625992;,
    0.735892; -0.633478; -0.239098;,
    0.773763; -0.633475; 0.000006;,
    0.735891; -0.633478; 0.239103;,
    0.625983; -0.633477; 0.454810;,
    0.454795; -0.633478; 0.625993;,
    0.239119; -0.633474; 0.735889;,
    -0.000000; -0.633481; 0.773759;,
    -0.239119; -0.633473; 0.735889;,
    -0.454794; -0.633478; 0.625993;,
    -0.625983; -0.633477; 0.454810;,
    -0.735891; -0.633478; 0.239102;,
    -0.773763; -0.633475; 0.000006;,
    -0.735892; -0.633478; -0.239098;,
    -0.625983; -0.633476; -0.454811;,
    -0.454796; -0.633478; -0.625992;,
    -0.239118; -0.633474; -0.735889;,
    -0.000001; -0.633483; -0.773756;,
    0.239117; -0.633477; -0.735887;;
    116;
    3;2, 1, 0;,
    3;2, 3, 1;,
    3;5, 0, 4;,
    3;5, 2, 0;,
    3;7, 4, 6;,
    3;7, 5, 4;,
    3;9, 6, 8;,
    3;9, 7, 6;,
    3;11, 8, 10;,
    3;11, 9, 8;,
    3;13, 10, 12;,
    3;13, 11, 10;,
    3;15, 12, 14;,
    3;15, 13, 12;,
    3;17, 14, 16;,
    3;17, 15, 14;,
    3;19, 16, 18;,
    3;19, 17, 16;,
    3;21, 18, 20;,
    3;21, 19, 18;,
    3;24, 23, 22;,
    3;24, 25, 23;,
    3;27, 22, 26;,
    3;27, 24, 22;,
    3;29, 26, 28;,
    3;29, 27, 26;,
    3;31, 28, 30;,
    3;31, 29, 28;,
    3;33, 30, 32;,
    3;33, 31, 30;,
    3;35, 32, 34;,
    3;35, 33, 32;,
    3;37, 34, 36;,
    3;37, 35, 34;,
    3;39, 36, 38;,
    3;39, 37, 36;,
    3;41, 38, 40;,
    3;41, 39, 38;,
    3;3, 40, 1;,
    3;3, 41, 40;,
    3;44, 43, 42;,
    3;44, 45, 43;,
    3;46, 45, 44;,
    3;46, 47, 45;,
    3;48, 47, 46;,
    3;48, 49, 47;,
    3;50, 49, 48;,
    3;50, 51, 49;,
    3;52, 51, 50;,
    3;52, 53, 51;,
    3;54, 53, 52;,
    3;54, 55, 53;,
    3;56, 55, 54;,
    3;56, 57, 55;,
    3;58, 57, 56;,
    3;58, 59, 57;,
    3;60, 59, 58;,
    3;60, 61, 59;,
    3;64, 63, 62;,
    3;64, 65, 63;,
    3;66, 65, 64;,
    3;66, 67, 65;,
    3;68, 67, 66;,
    3;68, 69, 67;,
    3;70, 69, 68;,
    3;70, 71, 69;,
    3;72, 71, 70;,
    3;72, 73, 71;,
    3;74, 73, 72;,
    3;74, 75, 73;,
    3;76, 75, 74;,
    3;76, 77, 75;,
    3;78, 77, 76;,
    3;78, 79, 77;,
    3;80, 79, 78;,
    3;80, 81, 79;,
    3;48, 83, 82;,
    3;48, 46, 83;,
    3;50, 82, 84;,
    3;50, 48, 82;,
    3;52, 84, 85;,
    3;52, 50, 84;,
    3;54, 85, 86;,
    3;54, 52, 85;,
    3;56, 86, 87;,
    3;56, 54, 86;,
    3;58, 87, 88;,
    3;58, 56, 87;,
    3;60, 88, 89;,
    3;60, 58, 88;,
    3;61, 89, 90;,
    3;61, 60, 89;,
    3;59, 90, 91;,
    3;59, 61, 90;,
    3;57, 91, 92;,
    3;57, 59, 91;,
    3;55, 92, 93;,
    3;55, 57, 92;,
    3;53, 93, 94;,
    3;53, 55, 93;,
    3;51, 94, 95;,
    3;51, 53, 94;,
    3;49, 95, 96;,
    3;49, 51, 95;,
    3;47, 96, 97;,
    3;47, 49, 96;,
    3;45, 97, 98;,
    3;45, 47, 97;,
    3;43, 98, 99;,
    3;43, 45, 98;,
    3;42, 99, 100;,
    3;42, 43, 99;,
    3;44, 100, 101;,
    3;44, 42, 100;,
    3;46, 101, 83;,
    3;46, 44, 101;;
   }

   MeshTextureCoords {
    102;
    0.576377; 0.793643;,
    0.537875; 0.793643;,
    0.576377; 0.921598;,
    0.537875; 0.921598;,
    0.614874; 0.793643;,
    0.614874; 0.921598;,
    0.653374; 0.793643;,
    0.653374; 0.921598;,
    0.691876; 0.793643;,
    0.691876; 0.921598;,
    0.730378; 0.793643;,
    0.730378; 0.921598;,
    0.768875; 0.793643;,
    0.768875; 0.921598;,
    0.807377; 0.793643;,
    0.807377; 0.921598;,
    0.845877; 0.793643;,
    0.845877; 0.921598;,
    0.884374; 0.793643;,
    0.884374; 0.921598;,
    0.922875; 0.793643;,
    0.922875; 0.921598;,
    0.191377; 0.793643;,
    0.152875; 0.793643;,
    0.191377; 0.921598;,
    0.152875; 0.921598;,
    0.229873; 0.793643;,
    0.229873; 0.921598;,
    0.268373; 0.793643;,
    0.268373; 0.921598;,
    0.306875; 0.793643;,
    0.306875; 0.921598;,
    0.345373; 0.793643;,
    0.345373; 0.921598;,
    0.383875; 0.793643;,
    0.383875; 0.921598;,
    0.422377; 0.793643;,
    0.422377; 0.921598;,
    0.460877; 0.793643;,
    0.460877; 0.921598;,
    0.499374; 0.793643;,
    0.499374; 0.921598;,
    0.356853; 0.573264;,
    0.290444; 0.562750;,
    0.423262; 0.562750;,
    0.230550; 0.532234;,
    0.483157; 0.532234;,
    0.183006; 0.484690;,
    0.530701; 0.484690;,
    0.152480; 0.424785;,
    0.561227; 0.424785;,
    0.141966; 0.358376;,
    0.571742; 0.358376;,
    0.152480; 0.291977;,
    0.561227; 0.291977;,
    0.183006; 0.232073;,
    0.530701; 0.232073;,
    0.230550; 0.184528;,
    0.483157; 0.184528;,
    0.290444; 0.154013;,
    0.423262; 0.154013;,
    0.356853; 0.143488;,
    0.470421; 0.958274;,
    0.588438; 0.963523;,
    0.363968; 0.943050;,
    0.706456; 0.958274;,
    0.279480; 0.919334;,
    0.812909; 0.943050;,
    0.225231; 0.889449;,
    0.897397; 0.919334;,
    0.206544; 0.856321;,
    0.951646; 0.889449;,
    0.225231; 0.823197;,
    0.970334; 0.856321;,
    0.279480; 0.793312;,
    0.951646; 0.823197;,
    0.363968; 0.769596;,
    0.897397; 0.793312;,
    0.470421; 0.754372;,
    0.812909; 0.769596;,
    0.588438; 0.749123;,
    0.706456; 0.754372;,
    0.627869; 0.555290;,
    0.553757; 0.629403;,
    0.675456; 0.461900;,
    0.691849; 0.358376;,
    0.675456; 0.254863;,
    0.627869; 0.161472;,
    0.553757; 0.087360;,
    0.460377; 0.039784;,
    0.356853; 0.023381;,
    0.253330; 0.039784;,
    0.159950; 0.087360;,
    0.085838; 0.161472;,
    0.038251; 0.254863;,
    0.021858; 0.358376;,
    0.038251; 0.461900;,
    0.085838; 0.555290;,
    0.159950; 0.629403;,
    0.253330; 0.676979;,
    0.356853; 0.693382;,
    0.460377; 0.676979;;
   }

   MeshVertexColors {
    102;
    0; 1.000000; 1.000000; 1.000000; 1.000000;,
    1; 1.000000; 1.000000; 1.000000; 1.000000;,
    2; 1.000000; 1.000000; 1.000000; 1.000000;,
    3; 1.000000; 1.000000; 1.000000; 1.000000;,
    4; 1.000000; 1.000000; 1.000000; 1.000000;,
    5; 1.000000; 1.000000; 1.000000; 1.000000;,
    6; 1.000000; 1.000000; 1.000000; 1.000000;,
    7; 1.000000; 1.000000; 1.000000; 1.000000;,
    8; 1.000000; 1.000000; 1.000000; 1.000000;,
    9; 1.000000; 1.000000; 1.000000; 1.000000;,
    10; 1.000000; 1.000000; 1.000000; 1.000000;,
    11; 1.000000; 1.000000; 1.000000; 1.000000;,
    12; 1.000000; 1.000000; 1.000000; 1.000000;,
    13; 1.000000; 1.000000; 1.000000; 1.000000;,
    14; 1.000000; 1.000000; 1.000000; 1.000000;,
    15; 1.000000; 1.000000; 1.000000; 1.000000;,
    16; 1.000000; 1.000000; 1.000000; 1.000000;,
    17; 1.000000; 1.000000; 1.000000; 1.000000;,
    18; 1.000000; 1.000000; 1.000000; 1.000000;,
    19; 1.000000; 1.000000; 1.000000; 1.000000;,
    20; 1.000000; 1.000000; 1.000000; 1.000000;,
    21; 1.000000; 1.000000; 1.000000; 1.000000;,
    22; 1.000000; 1.000000; 1.000000; 1.000000;,
    23; 1.000000; 1.000000; 1.000000; 1.000000;,
    24; 1.000000; 1.000000; 1.000000; 1.000000;,
    25; 1.000000; 1.000000; 1.000000; 1.000000;,
    26; 1.000000; 1.000000; 1.000000; 1.000000;,
    27; 1.000000; 1.000000; 1.000000; 1.000000;,
    28; 1.000000; 1.000000; 1.000000; 1.000000;,
    29; 1.000000; 1.000000; 1.000000; 1.000000;,
    30; 1.000000; 1.000000; 1.000000; 1.000000;,
    31; 1.000000; 1.000000; 1.000000; 1.000000;,
    32; 1.000000; 1.000000; 1.000000; 1.000000;,
    33; 1.000000; 1.000000; 1.000000; 1.000000;,
    34; 1.000000; 1.000000; 1.000000; 1.000000;,
    35; 1.000000; 1.000000; 1.000000; 1.000000;,
    36; 1.000000; 1.000000; 1.000000; 1.000000;,
    37; 1.000000; 1.000000; 1.000000; 1.000000;,
    38; 1.000000; 1.000000; 1.000000; 1.000000;,
    39; 1.000000; 1.000000; 1.000000; 1.000000;,
    40; 1.000000; 1.000000; 1.000000; 1.000000;,
    41; 1.000000; 1.000000; 1.000000; 1.000000;,
    42; 1.000000; 1.000000; 1.000000; 1.000000;,
    43; 1.000000; 1.000000; 1.000000; 1.000000;,
    44; 1.000000; 1.000000; 1.000000; 1.000000;,
    45; 1.000000; 1.000000; 1.000000; 1.000000;,
    46; 1.000000; 1.000000; 1.000000; 1.000000;,
    47; 1.000000; 1.000000; 1.000000; 1.000000;,
    48; 1.000000; 1.000000; 1.000000; 1.000000;,
    49; 1.000000; 1.000000; 1.000000; 1.000000;,
    50; 1.000000; 1.000000; 1.000000; 1.000000;,
    51; 1.000000; 1.000000; 1.000000; 1.000000;,
    52; 1.000000; 1.000000; 1.000000; 1.000000;,
    53; 1.000000; 1.000000; 1.000000; 1.000000;,
    54; 1.000000; 1.000000; 1.000000; 1.000000;,
    55; 1.000000; 1.000000; 1.000000; 1.000000;,
    56; 1.000000; 1.000000; 1.000000; 1.000000;,
    57; 1.000000; 1.000000; 1.000000; 1.000000;,
    58; 1.000000; 1.000000; 1.000000; 1.000000;,
    59; 1.000000; 1.000000; 1.000000; 1.000000;,
    60; 1.000000; 1.000000; 1.000000; 1.000000;,
    61; 1.000000; 1.000000; 1.000000; 1.000000;,
    62; 1.000000; 1.000000; 1.000000; 1.000000;,
    63; 1.000000; 1.000000; 1.000000; 1.000000;,
    64; 1.000000; 1.000000; 1.000000; 1.000000;,
    65; 1.000000; 1.000000; 1.000000; 1.000000;,
    66; 1.000000; 1.000000; 1.000000; 1.000000;,
    67; 1.000000; 1.000000; 1.000000; 1.000000;,
    68; 1.000000; 1.000000; 1.000000; 1.000000;,
    69; 1.000000; 1.000000; 1.000000; 1.000000;,
    70; 1.000000; 1.000000; 1.000000; 1.000000;,
    71; 1.000000; 1.000000; 1.000000; 1.000000;,
    72; 1.000000; 1.000000; 1.000000; 1.000000;,
    73; 1.000000; 1.000000; 1.000000; 1.000000;,
    74; 1.000000; 1.000000; 1.000000; 1.000000;,
    75; 1.000000; 1.000000; 1.000000; 1.000000;,
    76; 1.000000; 1.000000; 1.000000; 1.000000;,
    77; 1.000000; 1.000000; 1.000000; 1.000000;,
    78; 1.000000; 1.000000; 1.000000; 1.000000;,
    79; 1.000000; 1.000000; 1.000000; 1.000000;,
    80; 1.000000; 1.000000; 1.000000; 1.000000;,
    81; 1.000000; 1.000000; 1.000000; 1.000000;,
    82; 1.000000; 1.000000; 1.000000; 1.000000;,
    83; 1.000000; 1.000000; 1.000000; 1.000000;,
    84; 1.000000; 1.000000; 1.000000; 1.000000;,
    85; 1.000000; 1.000000; 1.000000; 1.000000;,
    86; 1.000000; 1.000000; 1.000000; 1.000000;,
    87; 1.000000; 1.000000; 1.000000; 1.000000;,
    88; 1.000000; 1.000000; 1.000000; 1.000000;,
    89; 1.000000; 1.000000; 1.000000; 1.000000;,
    90; 1.000000; 1.000000; 1.000000; 1.000000;,
    91; 1.000000; 1.000000; 1.000000; 1.000000;,
    92; 1.000000; 1.000000; 1.000000; 1.000000;,
    93; 1.000000; 1.000000; 1.000000; 1.000000;,
    94; 1.000000; 1.000000; 1.000000; 1.000000;,
    95; 1.000000; 1.000000; 1.000000; 1.000000;,
    96; 1.000000; 1.000000; 1.000000; 1.000000;,
    97; 1.000000; 1.000000; 1.000000; 1.000000;,
    98; 1.000000; 1.000000; 1.000000; 1.000000;,
    99; 1.000000; 1.000000; 1.000000; 1.000000;,
    100; 1.000000; 1.000000; 1.000000; 1.000000;,
    101; 1.000000; 1.000000; 1.000000; 1.000000;;
   }

   MeshMaterialList {
    1;
    116;
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0;

    Material def_surf_mat {
     0.992157; 0.992157; 0.992157; 1.000000;;
     128.000000;
     0.150000; 0.150000; 0.150000;;
     0.000000; 0.000000; 0.000000;;

     TextureFilename {
      "smoke_alarm.dds";
     }
    }

   }
  }
}
